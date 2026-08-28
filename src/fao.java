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

public class fao {
   private static final Logger g = LogUtils.getLogger();
   public static final Codec<alj<fao>> a = alj.a(mi.br);
   public static final bbc b = fdc.q;
   public static final long c = 0L;
   public static final Codec<fao> d = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     fdc.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.h),
                     alk.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.i),
                     fan.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.j),
                     fbz.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.k)
                  )
                  .apply($$0, fao::new)
         )
   );
   public static final Codec<jg<fao>> e = alg.a(mi.br, d);
   public static final fao f = new fao(fdc.b, Optional.empty(), List.of(), List.of());
   private final bbc h;
   private final Optional<alk> i;
   private final List<fan> j;
   private final List<fbx> k;
   private final BiFunction<daa, faj, daa> l;

   fao(bbc $$0, Optional<alk> $$1, List<fan> $$2, List<fbx> $$3) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
      this.k = $$3;
      this.l = fbz.a($$3);
   }

   public static Consumer<daa> a(aru $$0, Consumer<daa> $$1) {
      return $$2 -> {
         if ($$2.a($$0.K())) {
            if ($$2.M() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  daa $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(fam $$0, Consumer<daa> $$1) {
      this.a(new faj.a($$0).a(this.i), $$1);
   }

   public void a(faj $$0, Consumer<daa> $$1) {
      faj.c<?> $$2 = faj.a(this);
      if ($$0.b($$2)) {
         Consumer<daa> $$3 = fbx.a(this.l, $$1, $$0);

         for (fan $$4 : this.j) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         g.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(fam $$0, long $$1, Consumer<daa> $$2) {
      this.a(new faj.a($$0).a($$1).a(this.i), a($$0.a(), $$2));
   }

   public void b(fam $$0, Consumer<daa> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(faj $$0, Consumer<daa> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<daa> a(fam $$0, azz $$1) {
      return this.a(new faj.a($$0).a($$1).a(this.i));
   }

   public ObjectArrayList<daa> a(fam $$0, long $$1) {
      return this.a(new faj.a($$0).a($$1).a(this.i));
   }

   public ObjectArrayList<daa> a(fam $$0) {
      return this.a(new faj.a($$0).a(this.i));
   }

   private ObjectArrayList<daa> a(faj $$0) {
      ObjectArrayList<daa> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public bbc a() {
      return this.h;
   }

   public void a(fap $$0) {
      for (int $$1 = 0; $$1 < this.j.size(); $$1++) {
         this.j.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.k.size(); $$2++) {
         this.k.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bum $$0, fam $$1, long $$2) {
      faj $$3 = new faj.a($$1).a($$2).a(this.i);
      ObjectArrayList<daa> $$4 = this.a($$3);
      azz $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         daa $$7 = (daa)var9.next();
         if ($$6.isEmpty()) {
            g.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), daa.k);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<daa> $$0, int $$1, azz $$2) {
      List<daa> $$3 = Lists.newArrayList();
      Iterator<daa> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         daa $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         daa $$6 = $$3.remove(azq.a($$2, 0, $$3.size() - 1));
         int $$7 = azq.a($$2, 1, $$6.M() / 2);
         daa $$8 = $$6.a($$7);
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

   private List<Integer> a(bum $$0, azz $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      ag.c($$2, $$1);
      return $$2;
   }

   public static fao.a b() {
      return new fao.a();
   }

   public static class a implements fbt<fao.a> {
      private final Builder<fan> a = ImmutableList.builder();
      private final Builder<fbx> b = ImmutableList.builder();
      private bbc c = fao.b;
      private Optional<alk> d = Optional.empty();

      public fao.a a(fan.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public fao.a a(bbc $$0) {
         this.c = $$0;
         return this;
      }

      public fao.a a(alk $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public fao.a a(fbx.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public fao.a a() {
         return this;
      }

      public fao b() {
         return new fao(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
