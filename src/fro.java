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

public class fro extends fmy {
   private static final xl a = xl.c("editGamerule.title");
   private static final int b = 8;
   final fkm c = new fkm(this);
   private final Consumer<Optional<dbp>> d;
   private final Set<fro.f> r = Sets.newHashSet();
   private final dbp s;
   @Nullable
   private fro.g u;
   @Nullable
   private fgz v;

   public fro(dbp $$0, Consumer<Optional<dbp>> $$1) {
      super(a);
      this.s = $$0;
      this.d = $$1;
   }

   @Override
   protected void aN_() {
      this.c.a(a, this.p);
      this.u = this.c.c(new fro.g(this.s));
      fkq $$0 = this.c.b(fkq.e().a(8));
      this.v = $$0.a(fgz.a(xk.d, $$0x -> this.d.accept(Optional.of(this.s))).a());
      $$0.a(fgz.a(xk.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fgx var10000 = this.c($$1);
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

   void a(fro.f $$0) {
      this.r.add($$0);
      this.m();
   }

   void b(fro.f $$0) {
      this.r.remove($$0);
      this.m();
   }

   public class a extends fro.d {
      private final fhg<Boolean> c;

      public a(final xl $$1, final List<ayg> $$2, final String $$3, final dbp.a $$4) {
         super($$2, $$1);
         this.c = fhg.b($$4.a()).a().a($$1x -> $$1x.d().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fro.f {
      final xl b;

      public b(final xl $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fro.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fiv> aF_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fkt> b() {
         return ImmutableList.of(new fkt() {
            @Override
            public fkt.a t() {
               return fkt.a.b;
            }

            @Override
            public void b(fkv $$0) {
               $$0.a(fku.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dbp.g<T>> {
      fro.f create(xl var1, List<ayg> var2, String var3, T var4);
   }

   public abstract class d extends fro.f {
      private final List<ayg> c;
      protected final List<fgx> a = Lists.newArrayList();

      public d(@Nullable final List<ayg> $$1, final xl $$2) {
         super($$1);
         this.c = fro.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fiv> aF_() {
         return this.a;
      }

      @Override
      public List<? extends fkt> b() {
         return this.a;
      }

      protected void a(fgm $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(fro.this.m.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(fro.this.m.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(fro.this.m.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fro.d {
      private final fhi d;

      public e(final xl $$1, final List<ayg> $$2, final String $$3, final dbp.d $$4) {
         super($$2, $$1);
         this.d = new fhi(fro.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fro.this.b(this);
            } else {
               this.d.g(-65536);
               fro.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fhf.a<fro.f> {
      @Nullable
      final List<ayg> a;

      public f(@Nullable List<ayg> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fhf<fro.f> {
      private static final int m = 24;

      public g(final dbp $$1) {
         super(ffa.Q(), fro.this.n, fro.this.c.d(), fro.this.c.c(), 24);
         final Map<dbp.b, Map<dbp.e<?>, fro.f>> $$2 = Maps.newHashMap();
         dbp.a(new dbp.c() {
            @Override
            public void b(dbp.e<dbp.a> $$0, dbp.f<dbp.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fro.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dbp.e<dbp.d> $$0, dbp.f<dbp.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fro.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dbp.g<T>> void a(dbp.e<T> $$0, fro.c<T> $$1x) {
               xl $$2 = xl.c($$0.b());
               xl $$3 = xl.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               xl $$6 = xl.a("editGamerule.default", xl.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayg> $$10;
               String $$11;
               if (gqa.a($$7)) {
                  Builder<ayg> $$8 = ImmutableList.builder().add($$3.g());
                  xl $$9 = xl.c($$7);
                  fro.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fro.this.new b(xl.c(((dbp.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dbp.e::a)))
                     .forEach($$0xx -> this.b((fro.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fgm $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fro.f $$4 = this.u();
         if ($$4 != null && $$4.a != null) {
            fro.this.b($$4.a);
         }
      }
   }
}
