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

public class ewn {
   private static final Logger f = LogUtils.getLogger();
   public static final ewn a = new ewn(ezb.b, Optional.empty(), List.of(), List.of());
   public static final bbe b = ezb.q;
   public static final long c = 0L;
   public static final Codec<ewn> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ezb.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               alp.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               ewm.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               exy.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, ewn::new)
   );
   public static final Codec<jq<ewn>> e = all.a(mb.bg, d);
   private final bbe g;
   private final Optional<alp> h;
   private final List<ewm> i;
   private final List<exw> j;
   private final BiFunction<cxg, ewi, cxg> k;

   ewn(bbe $$0, Optional<alp> $$1, List<ewm> $$2, List<exw> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = exy.a($$3);
   }

   public static Consumer<cxg> a(arx $$0, Consumer<cxg> $$1) {
      return $$2 -> {
         if ($$2.a($$0.K())) {
            if ($$2.M() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  cxg $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(ewl $$0, Consumer<cxg> $$1) {
      this.a(new ewi.a($$0).a(this.h), $$1);
   }

   public void a(ewi $$0, Consumer<cxg> $$1) {
      ewi.c<?> $$2 = ewi.a(this);
      if ($$0.b($$2)) {
         Consumer<cxg> $$3 = exw.a(this.k, $$1, $$0);

         for (ewm $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(ewl $$0, long $$1, Consumer<cxg> $$2) {
      this.a(new ewi.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(ewl $$0, Consumer<cxg> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(ewi $$0, Consumer<cxg> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cxg> a(ewl $$0, bac $$1) {
      return this.a(new ewi.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cxg> a(ewl $$0, long $$1) {
      return this.a(new ewi.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cxg> a(ewl $$0) {
      return this.a(new ewi.a($$0).a(this.h));
   }

   private ObjectArrayList<cxg> a(ewi $$0) {
      ObjectArrayList<cxg> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public bbe a() {
      return this.g;
   }

   public void a(ewo $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bst $$0, ewl $$1, long $$2) {
      ewi $$3 = new ewi.a($$1).a($$2).a(this.h);
      ObjectArrayList<cxg> $$4 = this.a($$3);
      bac $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cxg $$7 = (cxg)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), cxg.j);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cxg> $$0, int $$1, bac $$2) {
      List<cxg> $$3 = Lists.newArrayList();
      Iterator<cxg> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cxg $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cxg $$6 = $$3.remove(azu.a($$2, 0, $$3.size() - 1));
         int $$7 = azu.a($$2, 1, $$6.M() / 2);
         cxg $$8 = $$6.a($$7);
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
      ae.c($$0, $$2);
   }

   private List<Integer> a(bst $$0, bac $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      ae.c($$2, $$1);
      return $$2;
   }

   public static ewn.a b() {
      return new ewn.a();
   }

   public static class a implements exs<ewn.a> {
      private final Builder<ewm> a = ImmutableList.builder();
      private final Builder<exw> b = ImmutableList.builder();
      private bbe c = ewn.b;
      private Optional<alp> d = Optional.empty();

      public ewn.a a(ewm.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ewn.a a(bbe $$0) {
         this.c = $$0;
         return this;
      }

      public ewn.a a(alp $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ewn.a a(exw.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public ewn.a a() {
         return this;
      }

      public ewn b() {
         return new ewn(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
