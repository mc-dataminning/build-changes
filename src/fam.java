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

public class fam {
   private static final Logger g = LogUtils.getLogger();
   public static final Codec<alh<fam>> a = alh.a(mh.br);
   public static final bba b = fda.q;
   public static final long c = 0L;
   public static final Codec<fam> d = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     fda.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.h),
                     ali.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.i),
                     fal.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.j),
                     fbx.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.k)
                  )
                  .apply($$0, fam::new)
         )
   );
   public static final Codec<jf<fam>> e = ale.a(mh.br, d);
   public static final fam f = new fam(fda.b, Optional.empty(), List.of(), List.of());
   private final bba h;
   private final Optional<ali> i;
   private final List<fal> j;
   private final List<fbv> k;
   private final BiFunction<czy, fah, czy> l;

   fam(bba $$0, Optional<ali> $$1, List<fal> $$2, List<fbv> $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
      this.l = fbx.a($$3);
   }

   public static Consumer<czy> a(ars $$0, Consumer<czy> $$1) {
      return $$2 -> {
         if ($$2.a($$0.K())) {
            if ($$2.M() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  czy $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(fak $$0, Consumer<czy> $$1) {
      this.a(new fah.a($$0).a(this.i), $$1);
   }

   public void a(fah $$0, Consumer<czy> $$1) {
      fah.c<?> $$2 = fah.a(this);
      if ($$0.b($$2)) {
         Consumer<czy> $$3 = fbv.a(this.l, $$1, $$0);

         for (fal $$4 : this.j) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         g.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(fak $$0, long $$1, Consumer<czy> $$2) {
      this.a(new fah.a($$0).a($$1).a(this.i), a($$0.a(), $$2));
   }

   public void b(fak $$0, Consumer<czy> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(fah $$0, Consumer<czy> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<czy> a(fak $$0, azx $$1) {
      return this.a(new fah.a($$0).a($$1).a(this.i));
   }

   public ObjectArrayList<czy> a(fak $$0, long $$1) {
      return this.a(new fah.a($$0).a($$1).a(this.i));
   }

   public ObjectArrayList<czy> a(fak $$0) {
      return this.a(new fah.a($$0).a(this.i));
   }

   private ObjectArrayList<czy> a(fah $$0) {
      ObjectArrayList<czy> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public bba a() {
      return this.h;
   }

   public void a(fan $$0) {
      for (int $$1 = 0; $$1 < this.j.size(); $$1++) {
         this.j.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.k.size(); $$2++) {
         this.k.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(buk $$0, fak $$1, long $$2) {
      fah $$3 = new fah.a($$1).a($$2).a(this.i);
      ObjectArrayList<czy> $$4 = this.a($$3);
      azx $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         czy $$7 = (czy)var9.next();
         if ($$6.isEmpty()) {
            g.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), czy.k);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<czy> $$0, int $$1, azx $$2) {
      List<czy> $$3 = Lists.newArrayList();
      Iterator<czy> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         czy $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         czy $$6 = $$3.remove(azo.a($$2, 0, $$3.size() - 1));
         int $$7 = azo.a($$2, 1, $$6.M() / 2);
         czy $$8 = $$6.a($$7);
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
      ag.c($$0, $$2);
   }

   private List<Integer> a(buk $$0, azx $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      ag.c($$2, $$1);
      return $$2;
   }

   public static fam.a b() {
      return new fam.a();
   }

   public static class a implements fbr<fam.a> {
      private final Builder<fal> a = ImmutableList.builder();
      private final Builder<fbv> b = ImmutableList.builder();
      private bba c = fam.b;
      private Optional<ali> d = Optional.empty();

      public fam.a a(fal.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public fam.a a(bba $$0) {
         this.c = $$0;
         return this;
      }

      public fam.a a(ali $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public fam.a a(fbv.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public fam.a a() {
         return this;
      }

      public fam b() {
         return new fam(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
