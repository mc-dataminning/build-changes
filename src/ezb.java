import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ezb extends euq {
   private final Consumer<Optional<cmi>> a;
   private ezb.g b;
   private final Set<ezb.f> c = Sets.newHashSet();
   private epi k;
   @Nullable
   private List<aom> l;
   private final cmi m;

   public ezb(cmi $$0, Consumer<Optional<cmi>> $$1) {
      super(sw.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void b() {
      this.b = new ezb.g(this.m);
      this.e(this.b);
      esf.b $$0 = new esf().a(10).d(2);
      this.k = $$0.a(epi.a(sv.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(epi.a(sv.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         epf var10000 = this.d($$1);
      });
      $$0.a().b(this.g / 2 - 155, this.h - 28);
      $$0.a().c();
   }

   @Override
   public void aw_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.l = null;
      this.b.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
      super.a($$0, $$1, $$2, $$3);
   }

   private void l() {
      this.k.r = this.c.isEmpty();
   }

   void a(ezb.f $$0) {
      this.c.add($$0);
      this.l();
   }

   void b(ezb.f $$0) {
      this.c.remove($$0);
      this.l();
   }

   public class a extends ezb.d {
      private final epp<Boolean> d;

      public a(sw $$1, List<aom> $$2, String $$3, cmi.a $$4) {
         super($$2, $$1);
         this.d = epp.b($$4.a()).a().a($$1x -> $$1x.b().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.e($$3 + $$4 - 45);
         this.d.f($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends ezb.f {
      final sw b;

      public b(sw $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ezb.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends eqt> i() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends esn> b() {
         return ImmutableList.of(new esn() {
            @Override
            public esn.a q() {
               return esn.a.b;
            }

            @Override
            public void b(esp $$0) {
               $$0.a(eso.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cmi.g<T>> {
      ezb.f create(sw var1, List<aom> var2, String var3, T var4);
   }

   public abstract class d extends ezb.f {
      private final List<aom> a;
      protected final List<epf> b = Lists.newArrayList();

      public d(@Nullable List<aom> $$1, sw $$2) {
         super($$1);
         this.a = ezb.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends eqt> i() {
         return this.b;
      }

      @Override
      public List<? extends esn> b() {
         return this.b;
      }

      protected void a(eox $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(ezb.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(ezb.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(ezb.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends ezb.d {
      private final epr d;

      public e(sw $$1, List<aom> $$2, String $$3, cmi.d $$4) {
         super($$2, $$1);
         this.d = new epr(ezb.this.f.h, 10, 5, 42, 20, $$1.e().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.n(14737632);
               ezb.this.b(this);
            } else {
               this.d.n(16711680);
               ezb.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(eox $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.e($$3 + $$4 - 44);
         this.d.f($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends epo.a<ezb.f> {
      @Nullable
      final List<aom> a;

      public f(@Nullable List<aom> $$0) {
         this.a = $$0;
      }
   }

   public class g extends epo<ezb.f> {
      public g(final cmi $$1) {
         super(ezb.this.f, ezb.this.g, ezb.this.h, 43, ezb.this.h - 32, 24);
         final Map<cmi.b, Map<cmi.e<?>, ezb.f>> $$2 = Maps.newHashMap();
         cmi.a(new cmi.c() {
            @Override
            public void b(cmi.e<cmi.a> $$0, cmi.f<cmi.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> ezb.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cmi.e<cmi.d> $$0, cmi.f<cmi.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> ezb.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cmi.g<T>> void a(cmi.e<T> $$0, ezb.c<T> $$1x) {
               sw $$2 = sw.c($$0.b());
               sw $$3 = sw.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               sw $$6 = sw.a("editGamerule.default", sw.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<aom> $$10;
               String $$11;
               if (fvz.a($$7)) {
                  Builder<aom> $$8 = ImmutableList.builder().add($$3.f());
                  sw $$9 = sw.c($$7);
                  ezb.this.i.c($$9, 150).forEach($$8::add);
                  $$10 = $$8.add($$6.f()).build();
                  $$11 = $$9.getString() + "\n" + $$6.getString();
               } else {
                  $$10 = ImmutableList.of($$3.f(), $$6.f());
                  $$11 = $$6.getString();
               }

               $$2.computeIfAbsent($$0.c(), $$0x -> Maps.newHashMap()).put($$0, $$1.create($$2, $$10, $$11, $$4));
            }
         });
         $$2.entrySet()
            .stream()
            .sorted(Entry.comparingByKey())
            .forEach(
               $$0x -> {
                  this.b(ezb.this.new b(sw.c(((cmi.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cmi.e::a)))
                     .forEach($$0xx -> this.b((ezb.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void a(eox $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         ezb.f $$4 = this.r();
         if ($$4 != null && $$4.a != null) {
            ezb.this.b($$4.a);
         }
      }
   }
}
