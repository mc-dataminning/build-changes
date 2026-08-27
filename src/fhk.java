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

public class fhk extends fct {
   private final Consumer<Optional<cte>> a;
   private fhk.g b;
   private final Set<fhk.f> c = Sets.newHashSet();
   private ewy k;
   @Nullable
   private List<atu> l;
   private final cte m;

   public fhk(cte $$0, Consumer<Optional<cte>> $$1) {
      super(vd.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aN_() {
      this.b = this.d(new fhk.g(this.m));
      fah.b $$0 = new fah().a(10).d(2);
      this.k = $$0.a(ewy.a(vc.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(ewy.a(vc.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         eww var10000 = this.d($$1);
      });
      $$0.a().c(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void aE_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void n() {
      this.k.j = this.c.isEmpty();
   }

   void a(fhk.f $$0) {
      this.c.add($$0);
      this.n();
   }

   void b(fhk.f $$0) {
      this.c.remove($$0);
      this.n();
   }

   public class a extends fhk.d {
      private final exf<Boolean> d;

      public a(vd $$1, List<atu> $$2, String $$3, cte.a $$4) {
         super($$2, $$1);
         this.d = exf.b($$4.a()).a().a($$1x -> $$1x.d().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.n($$3 + $$4 - 45);
         this.d.o($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fhk.f {
      final vd b;

      public b(vd $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fhk.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends eyt> l() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fap> a() {
         return ImmutableList.of(new fap() {
            @Override
            public fap.a s() {
               return fap.a.b;
            }

            @Override
            public void b(far $$0) {
               $$0.a(faq.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cte.g<T>> {
      fhk.f create(vd var1, List<atu> var2, String var3, T var4);
   }

   public abstract class d extends fhk.f {
      private final List<atu> a;
      protected final List<eww> b = Lists.newArrayList();

      public d(@Nullable List<atu> $$1, vd $$2) {
         super($$1);
         this.a = fhk.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends eyt> l() {
         return this.b;
      }

      @Override
      public List<? extends fap> a() {
         return this.b;
      }

      protected void a(ewm $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fhk.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fhk.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fhk.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fhk.d {
      private final exh d;

      public e(vd $$1, List<atu> $$2, String $$3, cte.d $$4) {
         super($$2, $$1);
         this.d = new exh(fhk.this.f.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.f(14737632);
               fhk.this.b(this);
            } else {
               this.d.f(16711680);
               fhk.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(ewm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.n($$3 + $$4 - 45);
         this.d.o($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends exe.a<fhk.f> {
      @Nullable
      final List<atu> a;

      public f(@Nullable List<atu> $$0) {
         this.a = $$0;
      }
   }

   public class g extends exe<fhk.f> {
      public g(final cte $$1) {
         super(fhk.this.f, fhk.this.g, fhk.this.h - 75, 43, 24);
         final Map<cte.b, Map<cte.e<?>, fhk.f>> $$2 = Maps.newHashMap();
         cte.a(new cte.c() {
            @Override
            public void b(cte.e<cte.a> $$0, cte.f<cte.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fhk.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cte.e<cte.d> $$0, cte.f<cte.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fhk.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cte.g<T>> void a(cte.e<T> $$0, fhk.c<T> $$1x) {
               vd $$2 = vd.c($$0.b());
               vd $$3 = vd.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               vd $$6 = vd.a("editGamerule.default", vd.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<atu> $$10;
               String $$11;
               if (gfl.a($$7)) {
                  Builder<atu> $$8 = ImmutableList.builder().add($$3.g());
                  vd $$9 = vd.c($$7);
                  fhk.this.i.c($$9, 150).forEach($$8::add);
                  $$10 = $$8.add($$6.g()).build();
                  $$11 = $$9.getString() + "\n" + $$6.getString();
               } else {
                  $$10 = ImmutableList.of($$3.g(), $$6.g());
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
                  this.b(fhk.this.new b(vd.c(((cte.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cte.e::a)))
                     .forEach($$0xx -> this.b((fhk.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(ewm $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fhk.f $$4 = this.t();
         if ($$4 != null && $$4.a != null) {
            fhk.this.b($$4.a);
         }
      }
   }
}
