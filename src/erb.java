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

public class erb {
   private static final Logger f = LogUtils.getLogger();
   public static final erb a = new erb(etr.b, Optional.empty(), List.of(), List.of());
   public static final etq b = etr.q;
   public static final long c = 0L;
   public static final Codec<erb> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               etr.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               akk.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               era.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               esm.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, erb::new)
   );
   public static final Codec<jj<erb>> e = akg.a(lr.bb, d);
   private final etq g;
   private final Optional<akk> h;
   private final List<era> i;
   private final List<esk> j;
   private final BiFunction<cud, eqw, cud> k;

   erb(etq $$0, Optional<akk> $$1, List<era> $$2, List<esk> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = esm.a($$3);
   }

   public static Consumer<cud> a(aqm $$0, Consumer<cud> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.H() < $$2.j()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.H();

               while ($$3 > 0) {
                  cud $$4 = $$2.c(Math.min($$2.j(), $$3));
                  $$3 -= $$4.H();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(eqz $$0, Consumer<cud> $$1) {
      this.a(new eqw.a($$0).a(this.h), $$1);
   }

   public void a(eqw $$0, Consumer<cud> $$1) {
      eqw.c<?> $$2 = eqw.a(this);
      if ($$0.b($$2)) {
         Consumer<cud> $$3 = esk.a(this.k, $$1, $$0);

         for (era $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(eqz $$0, long $$1, Consumer<cud> $$2) {
      this.a(new eqw.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(eqz $$0, Consumer<cud> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eqw $$0, Consumer<cud> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cud> a(eqz $$0, ayo $$1) {
      return this.a(new eqw.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cud> a(eqz $$0, long $$1) {
      return this.a(new eqw.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cud> a(eqz $$0) {
      return this.a(new eqw.a($$0).a(this.h));
   }

   private ObjectArrayList<cud> a(eqw $$0) {
      ObjectArrayList<cud> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public etq a() {
      return this.g;
   }

   public void a(erc $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bqa $$0, eqz $$1, long $$2) {
      eqw $$3 = new eqw.a($$1).a($$2).a(this.h);
      ObjectArrayList<cud> $$4 = this.a($$3);
      ayo $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cud $$7 = (cud)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.e()) {
            $$0.a($$6.remove($$6.size() - 1), cud.l);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cud> $$0, int $$1, ayo $$2) {
      List<cud> $$3 = Lists.newArrayList();
      Iterator<cud> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cud $$5 = $$4.next();
         if ($$5.e()) {
            $$4.remove();
         } else if ($$5.H() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cud $$6 = $$3.remove(ayg.a($$2, 0, $$3.size() - 1));
         int $$7 = ayg.a($$2, 1, $$6.H() / 2);
         cud $$8 = $$6.a($$7);
         if ($$6.H() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.H() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ac.c($$0, $$2);
   }

   private List<Integer> a(bqa $$0, ayo $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).e()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static erb.a b() {
      return new erb.a();
   }

   public static class a implements esg<erb.a> {
      private final Builder<era> a = ImmutableList.builder();
      private final Builder<esk> b = ImmutableList.builder();
      private etq c = erb.b;
      private Optional<akk> d = Optional.empty();

      public erb.a a(era.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public erb.a a(etq $$0) {
         this.c = $$0;
         return this;
      }

      public erb.a a(akk $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public erb.a a(esk.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public erb.a a() {
         return this;
      }

      public erb b() {
         return new erb(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
