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

public class evv {
   private static final Logger f = LogUtils.getLogger();
   public static final evv a = new evv(eyj.b, Optional.empty(), List.of(), List.of());
   public static final baj b = eyj.q;
   public static final long c = 0L;
   public static final Codec<evv> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eyj.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               akv.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               evu.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               exg.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, evv::new)
   );
   public static final Codec<jr<evv>> e = akr.a(mc.bg, d);
   private final baj g;
   private final Optional<akv> h;
   private final List<evu> i;
   private final List<exe> j;
   private final BiFunction<cwo, evq, cwo> k;

   evv(baj $$0, Optional<akv> $$1, List<evu> $$2, List<exe> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = exg.a($$3);
   }

   public static Consumer<cwo> a(ard $$0, Consumer<cwo> $$1) {
      return $$2 -> {
         if ($$2.a($$0.K())) {
            if ($$2.M() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  cwo $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(evt $$0, Consumer<cwo> $$1) {
      this.a(new evq.a($$0).a(this.h), $$1);
   }

   public void a(evq $$0, Consumer<cwo> $$1) {
      evq.c<?> $$2 = evq.a(this);
      if ($$0.b($$2)) {
         Consumer<cwo> $$3 = exe.a(this.k, $$1, $$0);

         for (evu $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(evt $$0, long $$1, Consumer<cwo> $$2) {
      this.a(new evq.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(evt $$0, Consumer<cwo> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(evq $$0, Consumer<cwo> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cwo> a(evt $$0, azh $$1) {
      return this.a(new evq.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cwo> a(evt $$0, long $$1) {
      return this.a(new evq.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cwo> a(evt $$0) {
      return this.a(new evq.a($$0).a(this.h));
   }

   private ObjectArrayList<cwo> a(evq $$0) {
      ObjectArrayList<cwo> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public baj a() {
      return this.g;
   }

   public void a(evw $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bsc $$0, evt $$1, long $$2) {
      evq $$3 = new evq.a($$1).a($$2).a(this.h);
      ObjectArrayList<cwo> $$4 = this.a($$3);
      azh $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cwo $$7 = (cwo)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), cwo.j);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cwo> $$0, int $$1, azh $$2) {
      List<cwo> $$3 = Lists.newArrayList();
      Iterator<cwo> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cwo $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cwo $$6 = $$3.remove(ayz.a($$2, 0, $$3.size() - 1));
         int $$7 = ayz.a($$2, 1, $$6.M() / 2);
         cwo $$8 = $$6.a($$7);
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

   private List<Integer> a(bsc $$0, azh $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      af.c($$2, $$1);
      return $$2;
   }

   public static evv.a b() {
      return new evv.a();
   }

   public static class a implements exa<evv.a> {
      private final Builder<evu> a = ImmutableList.builder();
      private final Builder<exe> b = ImmutableList.builder();
      private baj c = evv.b;
      private Optional<akv> d = Optional.empty();

      public evv.a a(evu.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public evv.a a(baj $$0) {
         this.c = $$0;
         return this;
      }

      public evv.a a(akv $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public evv.a a(exe.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public evv.a a() {
         return this;
      }

      public evv b() {
         return new evv(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
