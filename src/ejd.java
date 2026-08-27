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

public class ejd {
   private static final Logger d = LogUtils.getLogger();
   public static final ejd a = new ejd(elf.b, Optional.empty(), List.of(), List.of());
   public static final ele b = elf.o;
   public static final Codec<ejd> c = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               elf.a.optionalFieldOf("type", b).forGetter($$0x -> $$0x.e),
               avp.a(aiy.a, "random_sequence").forGetter($$0x -> $$0x.f),
               avp.a(ejc.a.listOf(), "pools", List.of()).forGetter($$0x -> $$0x.g),
               avp.a(ekk.b.listOf(), "functions", List.of()).forGetter($$0x -> $$0x.h)
            )
            .apply($$0, ejd::new)
   );
   private final ele e;
   private final Optional<aiy> f;
   private final List<ejc> g;
   private final List<eki> h;
   private final BiFunction<coz, eiv, coz> i;

   ejd(ele $$0, Optional<aiy> $$1, List<ejc> $$2, List<eki> $$3) {
      this.e = $$0;
      this.f = $$1;
      this.g = $$2;
      this.h = $$3;
      this.i = ekk.a($$3);
   }

   public static Consumer<coz> a(aov $$0, Consumer<coz> $$1) {
      return $$2 -> {
         if ($$2.a($$0.I())) {
            if ($$2.M() < $$2.g()) {
               $$1.accept($$2);
            } else {
               int $$3 = $$2.M();

               while ($$3 > 0) {
                  coz $$4 = $$2.c(Math.min($$2.g(), $$3));
                  $$3 -= $$4.M();
                  $$1.accept($$4);
               }
            }
         }
      };
   }

   public void a(ejb $$0, Consumer<coz> $$1) {
      this.a(new eiv.a($$0).a(this.f), $$1);
   }

   public void a(eiv $$0, Consumer<coz> $$1) {
      eiv.c<?> $$2 = eiv.a(this);
      if ($$0.b($$2)) {
         Consumer<coz> $$3 = eki.a(this.i, $$1, $$0);

         for (ejc $$4 : this.g) {
            $$4.a($$3, $$0);
         }

         $$0.c($$2);
      } else {
         d.warn("Detected infinite loop in loot tables");
      }
   }

   public void a(ejb $$0, long $$1, Consumer<coz> $$2) {
      this.a(new eiv.a($$0).a($$1).a(this.f), a($$0.a(), $$2));
   }

   public void b(ejb $$0, Consumer<coz> $$1) {
      this.a($$0, a($$0.a(), $$1));
   }

   public void b(eiv $$0, Consumer<coz> $$1) {
      this.a($$0, a($$0.d(), $$1));
   }

   public ObjectArrayList<coz> a(ejb $$0, long $$1) {
      return this.a(new eiv.a($$0).a($$1).a(this.f));
   }

   public ObjectArrayList<coz> a(ejb $$0) {
      return this.a(new eiv.a($$0).a(this.f));
   }

   private ObjectArrayList<coz> a(eiv $$0) {
      ObjectArrayList<coz> $$1 = new ObjectArrayList();
      this.b($$0, $$1::add);
      return $$1;
   }

   public ele a() {
      return this.e;
   }

   public void a(eje $$0) {
      for (int $$1 = 0; $$1 < this.g.size(); $$1++) {
         this.g.get($$1).a($$0.a(".pools[" + $$1 + "]"));
      }

      for (int $$2 = 0; $$2 < this.h.size(); $$2++) {
         this.h.get($$2).a($$0.a(".functions[" + $$2 + "]"));
      }
   }

   public void a(bln $$0, ejb $$1, long $$2) {
      eiv $$3 = new eiv.a($$1).a($$2).a(this.f);
      ObjectArrayList<coz> $$4 = this.a($$3);
      awo $$5 = $$3.b();
      List<Integer> $$6 = this.a($$0, $$5);
      this.a($$4, $$6.size(), $$5);
      ObjectListIterator var9 = $$4.iterator();

      while (var9.hasNext()) {
         coz $$7 = (coz)var9.next();
         if ($$6.isEmpty()) {
            d.warn("Tried to over-fill a container");
            return;
         }

         if ($$7.b()) {
            $$0.a($$6.remove($$6.size() - 1), coz.h);
         } else {
            $$0.a($$6.remove($$6.size() - 1), $$7);
         }
      }
   }

   private void a(ObjectArrayList<coz> $$0, int $$1, awo $$2) {
      List<coz> $$3 = Lists.newArrayList();
      Iterator<coz> $$4 = $$0.iterator();

      while ($$4.hasNext()) {
         coz $$5 = $$4.next();
         if ($$5.b()) {
            $$4.remove();
         } else if ($$5.M() > 1) {
            $$3.add($$5);
            $$4.remove();
         }
      }

      while ($$1 - $$0.size() - $$3.size() > 0 && !$$3.isEmpty()) {
         coz $$6 = $$3.remove(awh.a($$2, 0, $$3.size() - 1));
         int $$7 = awh.a($$2, 1, $$6.M() / 2);
         coz $$8 = $$6.a($$7);
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
      ac.c($$0, $$2);
   }

   private List<Integer> a(bln $$0, awo $$1) {
      ObjectArrayList<Integer> $$2 = new ObjectArrayList();

      for (int $$3 = 0; $$3 < $$0.b(); $$3++) {
         if ($$0.a($$3).b()) {
            $$2.add($$3);
         }
      }

      ac.c($$2, $$1);
      return $$2;
   }

   public static ejd.a b() {
      return new ejd.a();
   }

   public static class a implements ekf<ejd.a> {
      private final Builder<ejc> a = ImmutableList.builder();
      private final Builder<eki> b = ImmutableList.builder();
      private ele c = ejd.b;
      private Optional<aiy> d = Optional.empty();

      public ejd.a a(ejc.a $$0) {
         this.a.add($$0.b());
         return this;
      }

      public ejd.a a(ele $$0) {
         this.c = $$0;
         return this;
      }

      public ejd.a a(aiy $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ejd.a a(eki.a $$0) {
         this.b.add($$0.b());
         return this;
      }

      public ejd.a a() {
         return this;
      }

      public ejd b() {
         return new ejd(this.c, this.d, this.a.build(), this.b.build());
      }
   }
}
