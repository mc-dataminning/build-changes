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

public class ens {
   private static final Logger e = LogUtils.getLogger();
   public static final ens a = new ens(epw.b, Optional.empty(), List.of(), List.of());
   public static final epv b = epw.p;
   public static final long c = 0L;
   public static final Codec<ens> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               epw.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.f),
               awu.a(ajv.a, "random_sequence").forGetter($$0x -> $$0x.g),
               awu.a(enr.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.h),
               awu.a(epa.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.i)
            )
            .apply($$0, ens::new)
   );
   private final epv f;
   private final Optional<ajv> g;
   private final List<enr> h;
   private final List<eoy> i;
   private final BiFunction<crs, enk, crs> j;

   ens(epv $$0, Optional<ajv> $$1, List<enr> $$2, List<eoy> $$3) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
      this.i = $$3;
      this.j = epa.a($$3);
   }

   public static Consumer<crs> a(apu $$0, Consumer<crs> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.G() < $$2.i()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.G();

               while ($$3 > 0) {
                  crs $$4 = $$2.c(Math.min($$2.i(), $$3));
                  $$3 -= $$4.G();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(enq $$0, Consumer<crs> $$1) {
      this.a(new enk.a($$0).a(this.g), $$1);
   }

   public void a(enk $$0, Consumer<crs> $$1) {
      enk.c<?> $$2 = enk.a(this);
      if ($$0.b($$2)) {
         Consumer<crs> $$3 = eoy.a(this.j, $$1, $$0);

         for (enr $$4 : this.h) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         e.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(enq $$0, long $$1, Consumer<crs> $$2) {
      this.a(new enk.a($$0).a($$1).a(this.g), a($$0.a(), $$2));
   }

   public void b(enq $$0, Consumer<crs> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(enk $$0, Consumer<crs> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<crs> a(enq $$0, long $$1) {
      return this.a(new enk.a($$0).a($$1).a(this.g));
   }

   public ObjectArrayList<crs> a(enq $$0) {
      return this.a(new enk.a($$0).a(this.g));
   }

   private ObjectArrayList<crs> a(enk $$0) {
      ObjectArrayList<crs> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public epv a() {
      return this.f;
   }

   public void a(ent $$0) {
      for (int $$1 = 0; $$1 < this.h.size(); $$1++) {
         this.h.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.i.size(); $$2++) {
         this.i.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bny $$0, enq $$1, long $$2) {
      enk $$3 = new enk.a($$1).a($$2).a(this.g);
      ObjectArrayList<crs> $$4 = this.a($$3);
      axt $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         crs $$7 = (crs)var9.next();
         if ($$6.isEmpty()) {
            e.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.d()) {
            $$0.a($$6.remove($$6.size() - 1), crs.i);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<crs> $$0, int $$1, axt $$2) {
      List<crs> $$3 = Lists.newArrayList();
      Iterator<crs> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         crs $$5 = $$4.next();
         if ($$5.d()) {
            $$4.remove();
         } else if ($$5.G() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         crs $$6 = $$3.remove(axm.a($$2, 0, $$3.size() - 1));
         int $$7 = axm.a($$2, 1, $$6.G() / 2);
         crs $$8 = $$6.a($$7);
         if ($$6.G() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.G() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ac.c($$0, $$2);
   }

   private List<Integer> a(bny $$0, axt $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).d()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static ens.a b() {
      return new ens.a();
   }

   public static class a implements eov<ens.a> {
      private final Builder<enr> a = ImmutableList.builder();
      private final Builder<eoy> b = ImmutableList.builder();
      private epv c = ens.b;
      private Optional<ajv> d = Optional.empty();

      public ens.a a(enr.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ens.a a(epv $$0) {
         this.c = $$0;
         return this;
      }

      public ens.a a(ajv $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ens.a a(eoy.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public ens.a a() {
         return this;
      }

      public ens b() {
         return new ens(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
