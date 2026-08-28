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

public class eus {
   private static final Logger f = LogUtils.getLogger();
   public static final eus a = new eus(exi.b, Optional.empty(), List.of(), List.of());
   public static final exh b = exi.q;
   public static final long c = 0L;
   public static final Codec<eus> d = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               exi.a.lenientOptionalFieldOf("type", b).forGetter($$0x -> $$0x.g),
               alj.a.optionalFieldOf("random_sequence").forGetter($$0x -> $$0x.h),
               eur.a.listOf().optionalFieldOf("pools", List.of()).forGetter($$0x -> $$0x.i),
               ewd.c.listOf().optionalFieldOf("functions", List.of()).forGetter($$0x -> $$0x.j)
            )
            .apply($$0, eus::new)
   );
   public static final Codec<jq<eus>> e = alf.a(ma.bd, d);
   private final exh g;
   private final Optional<alj> h;
   private final List<eur> i;
   private final List<ewb> j;
   private final BiFunction<cwm, eun, cwm> k;

   eus(exh $$0, Optional<alj> $$1, List<eur> $$2, List<ewb> $$3) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      this.j = $$3;
      this.k = ewd.a($$3);
   }

   public static Consumer<cwm> a(arp $$0, Consumer<cwm> $$1) {
      return $$2 -> {
         if ($$2.a($$0.J())) {
            if ($$2.L() < $$2.k()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.L();

               while ($$3 > 0) {
                  cwm $$4 = $$2.c(Math.min($$2.k(), $$3));
                  $$3 -= $$4.L();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(euq $$0, Consumer<cwm> $$1) {
      this.a(new eun.a($$0).a(this.h), $$1);
   }

   public void a(eun $$0, Consumer<cwm> $$1) {
      eun.c<?> $$2 = eun.a(this);
      if ($$0.b($$2)) {
         Consumer<cwm> $$3 = ewb.a(this.k, $$1, $$0);

         for (eur $$4 : this.i) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         f.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(euq $$0, long $$1, Consumer<cwm> $$2) {
      this.a(new eun.a($$0).a($$1).a(this.h), a($$0.a(), $$2));
   }

   public void b(euq $$0, Consumer<cwm> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eun $$0, Consumer<cwm> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<cwm> a(euq $$0, azu $$1) {
      return this.a(new eun.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cwm> a(euq $$0, long $$1) {
      return this.a(new eun.a($$0).a($$1).a(this.h));
   }

   public ObjectArrayList<cwm> a(euq $$0) {
      return this.a(new eun.a($$0).a(this.h));
   }

   private ObjectArrayList<cwm> a(eun $$0) {
      ObjectArrayList<cwm> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public exh a() {
      return this.g;
   }

   public void a(eut $$0) {
      for (int $$1 = 0; $$1 < this.i.size(); $$1++) {
         this.i.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.j.size(); $$2++) {
         this.j.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bsd $$0, euq $$1, long $$2) {
      eun $$3 = new eun.a($$1).a($$2).a(this.h);
      ObjectArrayList<cwm> $$4 = this.a($$3);
      azu $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         cwm $$7 = (cwm)var9.next();
         if ($$6.isEmpty()) {
            f.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.f()) {
            $$0.a($$6.remove($$6.size() - 1), cwm.k);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<cwm> $$0, int $$1, azu $$2) {
      List<cwm> $$3 = Lists.newArrayList();
      Iterator<cwm> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         cwm $$5 = $$4.next();
         if ($$5.f()) {
            $$4.remove();
         } else if ($$5.L() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         cwm $$6 = $$3.remove(azm.a($$2, 0, $$3.size() - 1));
         int $$7 = azm.a($$2, 1, $$6.L() / 2);
         cwm $$8 = $$6.a($$7);
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

   private List<Integer> a(bsd $$0, azu $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).f()) {
            $$2.add($$3);
         }
      }

      ae.c($$2, $$1);
      return $$2;
   }

   public static eus.a b() {
      return new eus.a();
   }

   public static class a implements evx<eus.a> {
      private final Builder<eur> a = ImmutableList.builder();
      private final Builder<ewb> b = ImmutableList.builder();
      private exh c = eus.b;
      private Optional<alj> d = Optional.empty();

      public eus.a a(eur.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public eus.a a(exh $$0) {
         this.c = $$0;
         return this;
      }

      public eus.a a(alj $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public eus.a a(ewb.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public eus.a a() {
         return this;
      }

      public eus b() {
         return new eus(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
