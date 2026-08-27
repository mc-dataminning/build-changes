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

public class fti extends fon {
   private static final xe a = xe.c("editGamerule.title");
   private static final int b = 8;
   final fma c = new fma(this);
   private final Consumer<Optional<dbw>> d;
   private final Set<fti.f> r = Sets.newHashSet();
   private final dbw s;
   @Nullable
   private fti.g u;
   @Nullable
   private fin v;

   public fti(dbw $$0, Consumer<Optional<dbw>> $$1) {
      super(a);
      this.s = $$0;
      this.d = $$1;
   }

   @Override
   protected void aN_() {
      this.c.a(a, this.p);
      this.u = this.c.c(new fti.g(this.s));
      fme $$0 = this.c.b(fme.e().a(8));
      this.v = $$0.a(fin.a(xd.d, $$0x -> this.d.accept(Optional.of(this.s))).a());
      $$0.a(fin.a(xd.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fil var10000 = this.c($$1);
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

   private void B() {
      if (this.v != null) {
         this.v.j = this.r.isEmpty();
      }
   }

   void a(fti.f $$0) {
      this.r.add($$0);
      this.B();
   }

   void b(fti.f $$0) {
      this.r.remove($$0);
      this.B();
   }

   public class a extends fti.d {
      private final fiu<Boolean> d;

      public a(xe $$1, List<axy> $$2, String $$3, dbw.a $$4) {
         super($$2, $$1);
         this.d = fiu.b($$4.a()).a().a($$1x -> $$1x.d().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fti.f {
      final xe b;

      public b(xe $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fti.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fkj> aE_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fmh> b() {
         return ImmutableList.of(new fmh() {
            @Override
            public fmh.a t() {
               return fmh.a.b;
            }

            @Override
            public void b(fmj $$0) {
               $$0.a(fmi.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dbw.g<T>> {
      fti.f create(xe var1, List<axy> var2, String var3, T var4);
   }

   public abstract class d extends fti.f {
      private final List<axy> a;
      protected final List<fil> b = Lists.newArrayList();

      public d(@Nullable List<axy> $$1, xe $$2) {
         super($$1);
         this.a = fti.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fkj> aE_() {
         return this.b;
      }

      @Override
      public List<? extends fmh> b() {
         return this.b;
      }

      protected void a(fia $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fti.this.m.h, this.a.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fti.this.m.h, this.a.get(0), $$2, $$1, -1, false);
            $$0.a(fti.this.m.h, this.a.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fti.d {
      private final fiw d;

      public e(xe $$1, List<axy> $$2, String $$3, dbw.d $$4) {
         super($$2, $$1);
         this.d = new fiw(fti.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fti.this.b(this);
            } else {
               this.d.g(-65536);
               fti.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fit.a<fti.f> {
      @Nullable
      final List<axy> a;

      public f(@Nullable List<axy> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fit<fti.f> {
      private static final int m = 24;

      public g(final dbw $$1) {
         super(fgj.Q(), fti.this.n, fti.this.c.d(), fti.this.c.c(), 24);
         final Map<dbw.b, Map<dbw.e<?>, fti.f>> $$2 = Maps.newHashMap();
         dbw.a(new dbw.c() {
            @Override
            public void b(dbw.e<dbw.a> $$0, dbw.f<dbw.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fti.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dbw.e<dbw.d> $$0, dbw.f<dbw.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fti.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dbw.g<T>> void a(dbw.e<T> $$0, fti.c<T> $$1x) {
               xe $$2 = xe.c($$0.b());
               xe $$3 = xe.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               xe $$6 = xe.a("editGamerule.default", xe.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<axy> $$10;
               String $$11;
               if (gse.a($$7)) {
                  Builder<axy> $$8 = ImmutableList.builder().add($$3.g());
                  xe $$9 = xe.c($$7);
                  fti.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fti.this.new b(xe.c(((dbw.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dbw.e::a)))
                     .forEach($$0xx -> this.b((fti.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fia $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fti.f $$4 = this.u();
         if ($$4 != null && $$4.a != null) {
            fti.this.b($$4.a);
         }
      }
   }
}
