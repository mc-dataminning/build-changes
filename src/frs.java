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

public class frs extends fnc {
   private static final xo a = xo.c("editGamerule.title");
   private static final int b = 8;
   final fkq c = new fkq(this);
   private final Consumer<Optional<dbt>> d;
   private final Set<frs.f> r = Sets.newHashSet();
   private final dbt s;
   @Nullable
   private frs.g u;
   @Nullable
   private fhd v;

   public frs(dbt $$0, Consumer<Optional<dbt>> $$1) {
      super(a);
      this.s = $$0;
      this.d = $$1;
   }

   @Override
   protected void aM_() {
      this.c.a(a, this.p);
      this.u = this.c.c(new frs.g(this.s));
      fku $$0 = this.c.b(fku.e().a(8));
      this.v = $$0.a(fhd.a(xn.d, $$0x -> this.d.accept(Optional.of(this.s))).a());
      $$0.a(fhd.a(xn.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fhb var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      if (this.u != null) {
         this.u.a(this.n, this.c);
      }
   }

   @Override
   public void d() {
      this.d.accept(Optional.empty());
   }

   private void m() {
      if (this.v != null) {
         this.v.j = this.r.isEmpty();
      }
   }

   void a(frs.f $$0) {
      this.r.add($$0);
      this.m();
   }

   void b(frs.f $$0) {
      this.r.remove($$0);
      this.m();
   }

   public class a extends frs.d {
      private final fhk<Boolean> c;

      public a(final xo $$1, final List<ayk> $$2, final String $$3, final dbt.a $$4) {
         super($$2, $$1);
         this.c = fhk.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends frs.f {
      final xo b;

      public b(final xo $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(frs.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fiz> aD_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fkx> b() {
         return ImmutableList.of(new fkx() {
            @Override
            public fkx.a t() {
               return fkx.a.b;
            }

            @Override
            public void b(fkz $$0) {
               $$0.a(fky.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dbt.g<T>> {
      frs.f create(xo var1, List<ayk> var2, String var3, T var4);
   }

   public abstract class d extends frs.f {
      private final List<ayk> c;
      protected final List<fhb> a = Lists.newArrayList();

      public d(@Nullable final List<ayk> $$1, final xo $$2) {
         super($$1);
         this.c = frs.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fiz> aD_() {
         return this.a;
      }

      @Override
      public List<? extends fkx> b() {
         return this.a;
      }

      protected void a(fgq $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(frs.this.m.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(frs.this.m.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(frs.this.m.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends frs.d {
      private final fhm d;

      public e(final xo $$1, final List<ayk> $$2, final String $$3, final dbt.d $$4) {
         super($$2, $$1);
         this.d = new fhm(frs.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               frs.this.b(this);
            } else {
               this.d.g(-65536);
               frs.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fgq $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fhj.a<frs.f> {
      @Nullable
      final List<ayk> a;

      public f(@Nullable List<ayk> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fhj<frs.f> {
      private static final int m = 24;

      public g(final dbt $$1) {
         super(ffe.Q(), frs.this.n, frs.this.c.d(), frs.this.c.c(), 24);
         final Map<dbt.b, Map<dbt.e<?>, frs.f>> $$2 = Maps.newHashMap();
         dbt.a(new dbt.c() {
            @Override
            public void b(dbt.e<dbt.a> $$0, dbt.f<dbt.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> frs.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dbt.e<dbt.d> $$0, dbt.f<dbt.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> frs.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dbt.g<T>> void a(dbt.e<T> $$0, frs.c<T> $$1x) {
               xo $$2 = xo.c($$0.b());
               xo $$3 = xo.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               xo $$6 = xo.a("editGamerule.default", xo.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayk> $$10;
               String $$11;
               if (gqe.a($$7)) {
                  Builder<ayk> $$8 = ImmutableList.builder().add($$3.g());
                  xo $$9 = xo.c($$7);
                  frs.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(frs.this.new b(xo.c(((dbt.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dbt.e::a)))
                     .forEach($$0xx -> this.b((frs.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fgq $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         frs.f $$4 = this.u();
         if ($$4 != null && $$4.a != null) {
            frs.this.b($$4.a);
         }
      }
   }
}
