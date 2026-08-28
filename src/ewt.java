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

public class ewt {
   private static final Logger f = LogUtils.getLogger();
   public static final ewt a = new ewt(ezh.b, Optional.empty(), List.of(), List.of());
   public static final bbo b = ezh.q;
   public static final long c = 0L;
   public static final Codec<ewt> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ezh.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               alz.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               ews.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               eye.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, ewt::new)
   );
   public static final Codec<jq<ewt>> e = alv.a(mb.bg, d);
   private final bbo g;
   private final Optional<alz> h;
   private final List<ews> i;
   private final List<eyc> j;
   private final BiFunction<cxo, ewo, cxo> k;

   ewt(bbo $$0, Optional<alz> $$1, List<ews> $$2, List<eyc> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = eye.a($$3);
   }

   public static Consumer<cxo> a(ash $$0, Consumer<cxo> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.L() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  cxo $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(ewr $$0, Consumer<cxo> $$1) {
      this.a(new ewo.a($$0).a(this.h), $$1);
   }

   public void a(ewo $$0, Consumer<cxo> $$1) {
      ewo.c<?> $$2 = ewo.a(this);
      if ($$0.b($$2)) {
         Consumer<cxo> $$3 = eyc.a(this.k, $$1, $$0);

         for (ews $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(ewr $$0, long $$1, Consumer<cxo> $$2) {
      this.a(new ewo.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(ewr $$0, Consumer<cxo> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(ewo $$0, Consumer<cxo> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cxo> a(ewr $$0, bam $$1) {
      return this.a(new ewo.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cxo> a(ewr $$0, long $$1) {
      return this.a(new ewo.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cxo> a(ewr $$0) {
      return this.a(new ewo.a($$0).a(this.h));
   }

   private ObjectArrayList<cxo> a(ewo $$0) {
      ObjectArrayList<cxo> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public bbo a() {
      return this.g;
   }

   public void a(ewu $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(btb $$0, ewr $$1, long $$2) {
      ewo $$3 = new ewo.a($$1).a($$2).a(this.h);
      ObjectArrayList<cxo> $$4 = this.a($$3);
      bam $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cxo $$7 = (cxo)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), cxo.k);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cxo> $$0, int $$1, bam $$2) {
      List<cxo> $$3 = Lists.newArrayList();
      Iterator<cxo> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cxo $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cxo $$6 = $$3.remove(bae.a($$2, 0, $$3.size() - 1));
         int $$7 = bae.a($$2, 1, $$6.L() / 2);
         cxo $$8 = $$6.a($$7);
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

   private List<Integer> a(btb $$0, bam $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      ae.c($$2, $$1);
      return $$2;
   }

   public static ewt.a b() {
      return new ewt.a();
   }

   public static class a implements exy<ewt.a> {
      private final Builder<ews> a = ImmutableList.builder();
      private final Builder<eyc> b = ImmutableList.builder();
      private bbo c = ewt.b;
      private Optional<alz> d = Optional.empty();

      public ewt.a a(ews.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ewt.a a(bbo $$0) {
         this.c = $$0;
         return this;
      }

      public ewt.a a(alz $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ewt.a a(eyc.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public ewt.a a() {
         return this;
      }

      public ewt b() {
         return new ewt(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
