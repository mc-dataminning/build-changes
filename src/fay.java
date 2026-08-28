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

public class fay {
   private static final Logger g = LogUtils.getLogger();
   public static final Codec<alq<fay>> a = alq.a(mi.br);
   public static final bbl b = fdm.q;
   public static final long c = 0L;
   public static final Codec<fay> d = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     fdm.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.h),
                     alr.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.i),
                     fax.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.j),
                     fcj.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.k)
                  )
                  .apply($$0, fay::new)
         )
   );
   public static final Codec<jg<fay>> e = aln.a(mi.br, d);
   public static final fay f = new fay(fdm.b, Optional.empty(), List.of(), List.of());
   private final bbl h;
   private final Optional<alr> i;
   private final List<fax> j;
   private final List<fch> k;
   private final BiFunction<dak, fat, dak> l;

   fay(bbl $$0, Optional<alr> $$1, List<fax> $$2, List<fch> $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
      this.l = fcj.a($$3);
   }

   public static Consumer<dak> a(asb $$0, Consumer<dak> $$1) {
      return $$2 -> {
         if ($$2.a($$0.K())) {
            if ($$2.M() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  dak $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(faw $$0, Consumer<dak> $$1) {
      this.a(new fat.a($$0).a(this.i), $$1);
   }

   public void a(fat $$0, Consumer<dak> $$1) {
      fat.c<?> $$2 = fat.a(this);
      if ($$0.b($$2)) {
         Consumer<dak> $$3 = fch.a(this.l, $$1, $$0);

         for (fax $$4 : this.j) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         g.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(faw $$0, long $$1, Consumer<dak> $$2) {
      this.a(new fat.a($$0).a($$1).a(this.i), a($$0.a(), $$2));
   }

   public void b(faw $$0, Consumer<dak> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(fat $$0, Consumer<dak> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<dak> a(faw $$0, bai $$1) {
      return this.a(new fat.a($$0).a($$1).a(this.i));
   }

   public ObjectArrayList<dak> a(faw $$0, long $$1) {
      return this.a(new fat.a($$0).a($$1).a(this.i));
   }

   public ObjectArrayList<dak> a(faw $$0) {
      return this.a(new fat.a($$0).a(this.i));
   }

   private ObjectArrayList<dak> a(fat $$0) {
      ObjectArrayList<dak> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public bbl a() {
      return this.h;
   }

   public void a(faz $$0) {
      for (int $$1 = 0; $$1 < this.j.size(); $$1++) {
         this.j.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.k.size(); $$2++) {
         this.k.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(buv $$0, faw $$1, long $$2) {
      fat $$3 = new fat.a($$1).a($$2).a(this.i);
      ObjectArrayList<dak> $$4 = this.a($$3);
      bai $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         dak $$7 = (dak)var9.next();
         if ($$6.isEmpty()) {
            g.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), dak.l);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<dak> $$0, int $$1, bai $$2) {
      List<dak> $$3 = Lists.newArrayList();
      Iterator<dak> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         dak $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         dak $$6 = $$3.remove(azz.a($$2, 0, $$3.size() - 1));
         int $$7 = azz.a($$2, 1, $$6.M() / 2);
         dak $$8 = $$6.a($$7);
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

   private List<Integer> a(buv $$0, bai $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      ag.c($$2, $$1);
      return $$2;
   }

   public static fay.a b() {
      return new fay.a();
   }

   public static class a implements fcd<fay.a> {
      private final Builder<fax> a = ImmutableList.builder();
      private final Builder<fch> b = ImmutableList.builder();
      private bbl c = fay.b;
      private Optional<alr> d = Optional.empty();

      public fay.a a(fax.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public fay.a a(bbl $$0) {
         this.c = $$0;
         return this;
      }

      public fay.a a(alr $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public fay.a a(fch.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public fay.a a() {
         return this;
      }

      public fay b() {
         return new fay(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
