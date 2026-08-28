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

public class eys {
   private static final Logger f = LogUtils.getLogger();
   public static final eys a = new eys(fbg.b, Optional.empty(), List.of(), List.of());
   public static final baw b = fbg.q;
   public static final long c = 0L;
   public static final Codec<eys> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               fbg.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               ale.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               eyr.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               fad.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eys::new)
   );
   public static final Codec<je<eys>> e = ala.a(mg.bo, d);
   private final baw g;
   private final Optional<ale> h;
   private final List<eyr> i;
   private final List<fab> j;
   private final BiFunction<cys, eyn, cys> k;

   eys(baw $$0, Optional<ale> $$1, List<eyr> $$2, List<fab> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = fad.a($$3);
   }

   public static Consumer<cys> a(aro $$0, Consumer<cys> $$1) {
      return $$2 -> {
         if ($$2.a($$0.K())) {
            if ($$2.M() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  cys $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(eyq $$0, Consumer<cys> $$1) {
      this.a(new eyn.a($$0).a(this.h), $$1);
   }

   public void a(eyn $$0, Consumer<cys> $$1) {
      eyn.c<?> $$2 = eyn.a(this);
      if ($$0.b($$2)) {
         Consumer<cys> $$3 = fab.a(this.k, $$1, $$0);

         for (eyr $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(eyq $$0, long $$1, Consumer<cys> $$2) {
      this.a(new eyn.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(eyq $$0, Consumer<cys> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eyn $$0, Consumer<cys> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cys> a(eyq $$0, azt $$1) {
      return this.a(new eyn.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cys> a(eyq $$0, long $$1) {
      return this.a(new eyn.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cys> a(eyq $$0) {
      return this.a(new eyn.a($$0).a(this.h));
   }

   private ObjectArrayList<cys> a(eyn $$0) {
      ObjectArrayList<cys> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public baw a() {
      return this.g;
   }

   public void a(eyt $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(btr $$0, eyq $$1, long $$2) {
      eyn $$3 = new eyn.a($$1).a($$2).a(this.h);
      ObjectArrayList<cys> $$4 = this.a($$3);
      azt $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cys $$7 = (cys)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), cys.k);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cys> $$0, int $$1, azt $$2) {
      List<cys> $$3 = Lists.newArrayList();
      Iterator<cys> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cys $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cys $$6 = $$3.remove(azk.a($$2, 0, $$3.size() - 1));
         int $$7 = azk.a($$2, 1, $$6.M() / 2);
         cys $$8 = $$6.a($$7);
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

   private List<Integer> a(btr $$0, azt $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      af.c($$2, $$1);
      return $$2;
   }

   public static eys.a b() {
      return new eys.a();
   }

   public static class a implements ezx<eys.a> {
      private final Builder<eyr> a = ImmutableList.builder();
      private final Builder<fab> b = ImmutableList.builder();
      private baw c = eys.b;
      private Optional<ale> d = Optional.empty();

      public eys.a a(eyr.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eys.a a(baw $$0) {
         this.c = $$0;
         return this;
      }

      public eys.a a(ale $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public eys.a a(fab.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public eys.a a() {
         return this;
      }

      public eys b() {
         return new eys(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
