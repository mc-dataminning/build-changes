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

public class fsx extends fnx {
   private static final wy a = wy.c("editGamerule.title");
   private static final int b = 8;
   final flt c = new flt(this);
   private final Consumer<Optional<dcq>> q;
   private final Set<fsx.f> r = Sets.newHashSet();
   private final dcq s;
   @Nullable
   private fsx.g u;
   @Nullable
   private fig v;

   public fsx(dcq $$0, Consumer<Optional<dcq>> $$1) {
      super(a);
      this.s = $$0;
      this.q = $$1;
   }

   @Override
   protected void aP_() {
      this.c.a(a, this.o);
      this.u = this.c.c(new fsx.g(this.s));
      flx $$0 = this.c.b(flx.e().a(8));
      this.v = $$0.a(fig.a(wx.d, $$0x -> this.q.accept(Optional.of(this.s))).a());
      $$0.a(fig.a(wx.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fie var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      if (this.u != null) {
         this.u.a(this.m, this.c);
      }
   }

   @Override
   public void d() {
      this.q.accept(Optional.empty());
   }

   private void m() {
      if (this.v != null) {
         this.v.j = this.r.isEmpty();
      }
   }

   void a(fsx.f $$0) {
      this.r.add($$0);
      this.m();
   }

   void b(fsx.f $$0) {
      this.r.remove($$0);
      this.m();
   }

   public class a extends fsx.d {
      private final fin<Boolean> c;

      public a(final wy $$1, final List<axz> $$2, final String $$3, final dcq.a $$4) {
         super($$2, $$1);
         this.c = fin.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fsx.f {
      final wy b;

      public b(final wy $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fsx.this.l.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fkc> aG_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fma> b() {
         return ImmutableList.of(new fma() {
            @Override
            public fma.a u() {
               return fma.a.b;
            }

            @Override
            public void b(fmc $$0) {
               $$0.a(fmb.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dcq.g<T>> {
      fsx.f create(wy var1, List<axz> var2, String var3, T var4);
   }

   public abstract class d extends fsx.f {
      private final List<axz> c;
      protected final List<fie> a = Lists.newArrayList();

      public d(@Nullable final List<axz> $$1, final wy $$2) {
         super($$1);
         this.c = fsx.this.l.h.c($$2, 175);
      }

      @Override
      public List<? extends fkc> aG_() {
         return this.a;
      }

      @Override
      public List<? extends fma> b() {
         return this.a;
      }

      protected void a(fht $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(fsx.this.l.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(fsx.this.l.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(fsx.this.l.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fsx.d {
      private final fip d;

      public e(final wy $$1, final List<axz> $$2, final String $$3, final dcq.d $$4) {
         super($$2, $$1);
         this.d = new fip(fsx.this.l.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fsx.this.b(this);
            } else {
               this.d.g(-65536);
               fsx.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fim.a<fsx.f> {
      @Nullable
      final List<axz> a;

      public f(@Nullable List<axz> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fim<fsx.f> {
      private static final int m = 24;

      public g(final dcq $$1) {
         super(fgi.Q(), fsx.this.m, fsx.this.c.d(), fsx.this.c.c(), 24);
         final Map<dcq.b, Map<dcq.e<?>, fsx.f>> $$2 = Maps.newHashMap();
         dcq.a(new dcq.c() {
            @Override
            public void b(dcq.e<dcq.a> $$0, dcq.f<dcq.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fsx.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dcq.e<dcq.d> $$0, dcq.f<dcq.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fsx.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dcq.g<T>> void a(dcq.e<T> $$0, fsx.c<T> $$1x) {
               wy $$2 = wy.c($$0.b());
               wy $$3 = wy.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               wy $$6 = wy.a("editGamerule.default", wy.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<axz> $$10;
               String $$11;
               if (grl.a($$7)) {
                  Builder<axz> $$8 = ImmutableList.builder().add($$3.g());
                  wy $$9 = wy.c($$7);
                  fsx.this.o.c($$9, 150).forEach($$8::add);
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
                  this.b(fsx.this.new b(wy.c(((dcq.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dcq.e::a)))
                     .forEach($$0xx -> this.b((fsx.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fht $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fsx.f $$4 = this.v();
         if ($$4 != null && $$4.a != null) {
            fsx.this.b($$4.a);
         }
      }
   }
}
