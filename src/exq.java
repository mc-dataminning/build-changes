import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import org.slf4j.Logger;

public class exq {
   private static final Logger f = LogUtils.getLogger();
   public static final exq a = new exq(fae.b, Optional.empty(), List.of(), List.of());
   public static final bau b = fae.q;
   public static final long c = 0L;
   public static final Codec<exq> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               fae.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               ald.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               exp.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               ezb.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, exq::new)
   );
   public static final Codec<js<exq>> e = akz.a(me.bn, d);
   private final bau g;
   private final Optional<ald> h;
   private final List<exp> i;
   private final List<eyz> j;
   private final BiFunction<cxy, exl, cxy> k;

   exq(bau $$0, Optional<ald> $$1, List<exp> $$2, List<eyz> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = ezb.a($$3);
   }

   public static Consumer<cxy> a(arn $$0, Consumer<cxy> $$1) {
      return $$2 -> {
         if ($$2.a($$0.K())) {
            if ($$2.M() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  cxy $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(exo $$0, Consumer<cxy> $$1) {
      this.a(new exl.a($$0).a(this.h), $$1);
   }

   public void a(exl $$0, Consumer<cxy> $$1) {
      exl.c<?> $$2 = exl.a(this);
      if ($$0.b($$2)) {
         Consumer<cxy> $$3 = eyz.a(this.k, $$1, $$0);

         for (exp $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(exo $$0, long $$1, Consumer<cxy> $$2) {
      this.a(new exl.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(exo $$0, Consumer<cxy> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(exl $$0, Consumer<cxy> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cxy> a(exo $$0, azs $$1) {
      return this.a(new exl.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cxy> a(exo $$0, long $$1) {
      return this.a(new exl.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cxy> a(exo $$0) {
      return this.a(new exl.a($$0).a(this.h));
   }

   private ObjectArrayList<cxy> a(exl $$0) {
      ObjectArrayList<cxy> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public bau a() {
      return this.g;
   }

   public void a(exr $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(btj $$0, exo $$1, long $$2) {
      exl $$3 = new exl.a($$1).a($$2).a(this.h);
      ObjectArrayList<cxy> $$4 = this.a($$3);
      azs $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cxy $$7 = (cxy)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), cxy.k);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cxy> $$0, int $$1, azs $$2) {
      List<cxy> $$3 = Lists.newArrayList();
      Iterator<cxy> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cxy $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cxy $$6 = $$3.remove(azk.a($$2, 0, $$3.size() - 1));
         int $$7 = azk.a($$2, 1, $$6.M() / 2);
         cxy $$8 = $$6.a($$7);
         if ($$6.M() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.M() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      af.c($$0, $$2);
   }

   private List<Integer> a(btj $$0, azs $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      af.c($$2, $$1);
      return $$2;
   }

   public static exq.a b() {
      return new exq.a();
   }

   public static class a implements eyv<exq.a> {
      private final Builder<exp> a = ImmutableList.builder();
      private final Builder<eyz> b = ImmutableList.builder();
      private bau c = exq.b;
      private Optional<ald> d = Optional.empty();

      public exq.a a(exp.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public exq.a a(bau $$0) {
         this.c = $$0;
         return this;
      }

      public exq.a a(ald $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public exq.a a(eyz.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public exq.a a() {
         return this;
      }

      public exq b() {
         return new exq(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
