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

public class ewm {
   private static final Logger f = LogUtils.getLogger();
   public static final ewm a = new ewm(ezc.b, Optional.empty(), List.of(), List.of());
   public static final ezb b = ezc.q;
   public static final long c = 0L;
   public static final Codec<ewm> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ezc.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               alz.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               ewl.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               exx.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, ewm::new)
   );
   public static final Codec<jq<ewm>> e = alv.a(mb.bf, d);
   private final ezb g;
   private final Optional<alz> h;
   private final List<ewl> i;
   private final List<exv> j;
   private final BiFunction<cxk, ewh, cxk> k;

   ewm(ezb $$0, Optional<alz> $$1, List<ewl> $$2, List<exv> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = exx.a($$3);
   }

   public static Consumer<cxk> a(ash $$0, Consumer<cxk> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.L() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  cxk $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(ewk $$0, Consumer<cxk> $$1) {
      this.a(new ewh.a($$0).a(this.h), $$1);
   }

   public void a(ewh $$0, Consumer<cxk> $$1) {
      ewh.c<?> $$2 = ewh.a(this);
      if ($$0.b($$2)) {
         Consumer<cxk> $$3 = exv.a(this.k, $$1, $$0);

         for (ewl $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(ewk $$0, long $$1, Consumer<cxk> $$2) {
      this.a(new ewh.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(ewk $$0, Consumer<cxk> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(ewh $$0, Consumer<cxk> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cxk> a(ewk $$0, bam $$1) {
      return this.a(new ewh.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cxk> a(ewk $$0, long $$1) {
      return this.a(new ewh.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cxk> a(ewk $$0) {
      return this.a(new ewh.a($$0).a(this.h));
   }

   private ObjectArrayList<cxk> a(ewh $$0) {
      ObjectArrayList<cxk> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public ezb a() {
      return this.g;
   }

   public void a(ewn $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bsx $$0, ewk $$1, long $$2) {
      ewh $$3 = new ewh.a($$1).a($$2).a(this.h);
      ObjectArrayList<cxk> $$4 = this.a($$3);
      bam $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cxk $$7 = (cxk)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), cxk.k);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cxk> $$0, int $$1, bam $$2) {
      List<cxk> $$3 = Lists.newArrayList();
      Iterator<cxk> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cxk $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cxk $$6 = $$3.remove(bae.a($$2, 0, $$3.size() - 1));
         int $$7 = bae.a($$2, 1, $$6.L() / 2);
         cxk $$8 = $$6.a($$7);
         if ($$6.L() > 1 && $$2.h()) {
            $$3.add($$6);
         } else {
            $$0.add($$6);
         }

         if ($$8.L() > 1 && $$2.h()) {
            $$3.add($$8);
         } else {
            $$0.add($$8);
         }
      }

      $$0.addAll($$3);
      ae.c($$0, $$2);
   }

   private List<Integer> a(bsx $$0, bam $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      ae.c($$2, $$1);
      return $$2;
   }

   public static ewm.a b() {
      return new ewm.a();
   }

   public static class a implements exr<ewm.a> {
      private final Builder<ewl> a = ImmutableList.builder();
      private final Builder<exv> b = ImmutableList.builder();
      private ezb c = ewm.b;
      private Optional<alz> d = Optional.empty();

      public ewm.a a(ewl.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ewm.a a(ezb $$0) {
         this.c = $$0;
         return this;
      }

      public ewm.a a(alz $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ewm.a a(exv.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public ewm.a a() {
         return this;
      }

      public ewm b() {
         return new ewm(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
