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

public class evw {
   private static final Logger f = LogUtils.getLogger();
   public static final evw a = new evw(eyk.b, Optional.empty(), List.of(), List.of());
   public static final baj b = eyk.q;
   public static final long c = 0L;
   public static final Codec<evw> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eyk.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               akv.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               evv.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               exh.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, evw::new)
   );
   public static final Codec<jr<evw>> e = akr.a(mc.bg, d);
   private final baj g;
   private final Optional<akv> h;
   private final List<evv> i;
   private final List<exf> j;
   private final BiFunction<cwp, evr, cwp> k;

   evw(baj $$0, Optional<akv> $$1, List<evv> $$2, List<exf> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = exh.a($$3);
   }

   public static Consumer<cwp> a(ard $$0, Consumer<cwp> $$1) {
      return $$2 -> {
         if ($$2.a($$0.K())) {
            if ($$2.M() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  cwp $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(evu $$0, Consumer<cwp> $$1) {
      this.a(new evr.a($$0).a(this.h), $$1);
   }

   public void a(evr $$0, Consumer<cwp> $$1) {
      evr.c<?> $$2 = evr.a(this);
      if ($$0.b($$2)) {
         Consumer<cwp> $$3 = exf.a(this.k, $$1, $$0);

         for (evv $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(evu $$0, long $$1, Consumer<cwp> $$2) {
      this.a(new evr.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(evu $$0, Consumer<cwp> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(evr $$0, Consumer<cwp> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cwp> a(evu $$0, azh $$1) {
      return this.a(new evr.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cwp> a(evu $$0, long $$1) {
      return this.a(new evr.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cwp> a(evu $$0) {
      return this.a(new evr.a($$0).a(this.h));
   }

   private ObjectArrayList<cwp> a(evr $$0) {
      ObjectArrayList<cwp> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public baj a() {
      return this.g;
   }

   public void a(evx $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bsd $$0, evu $$1, long $$2) {
      evr $$3 = new evr.a($$1).a($$2).a(this.h);
      ObjectArrayList<cwp> $$4 = this.a($$3);
      azh $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cwp $$7 = (cwp)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), cwp.j);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cwp> $$0, int $$1, azh $$2) {
      List<cwp> $$3 = Lists.newArrayList();
      Iterator<cwp> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cwp $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cwp $$6 = $$3.remove(ayz.a($$2, 0, $$3.size() - 1));
         int $$7 = ayz.a($$2, 1, $$6.M() / 2);
         cwp $$8 = $$6.a($$7);
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

   private List<Integer> a(bsd $$0, azh $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      af.c($$2, $$1);
      return $$2;
   }

   public static evw.a b() {
      return new evw.a();
   }

   public static class a implements exb<evw.a> {
      private final Builder<evv> a = ImmutableList.builder();
      private final Builder<exf> b = ImmutableList.builder();
      private baj c = evw.b;
      private Optional<akv> d = Optional.empty();

      public evw.a a(evv.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public evw.a a(baj $$0) {
         this.c = $$0;
         return this;
      }

      public evw.a a(akv $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public evw.a a(exf.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public evw.a a() {
         return this;
      }

      public evw b() {
         return new evw(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
