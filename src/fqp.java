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

public class fqp extends flz {
   private static final wx a = wx.c("editGamerule.title");
   private static final int b = 8;
   final fjn c = new fjn(this);
   private final Consumer<Optional<dav>> d;
   private final Set<fqp.f> r = Sets.newHashSet();
   private final dav s;
   @Nullable
   private fqp.g u;
   @Nullable
   private fga v;

   public fqp(dav $$0, Consumer<Optional<dav>> $$1) {
      super(a);
      this.s = $$0;
      this.d = $$1;
   }

   @Override
   protected void aN_() {
      this.c.a(a, this.p);
      this.u = this.c.c(new fqp.g(this.s));
      fjr $$0 = this.c.b(fjr.e().a(8));
      this.v = $$0.a(fga.a(ww.d, $$0x -> this.d.accept(Optional.of(this.s))).a());
      $$0.a(fga.a(ww.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         ffy var10000 = this.c($$1);
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

   void a(fqp.f $$0) {
      this.r.add($$0);
      this.m();
   }

   void b(fqp.f $$0) {
      this.r.remove($$0);
      this.m();
   }

   public class a extends fqp.d {
      private final fgh<Boolean> c;

      public a(wx $$1, List<axr> $$2, String $$3, dav.a $$4) {
         super($$2, $$1);
         this.c = fgh.b($$4.a()).a().a($$1x -> $$1x.d().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fqp.f {
      final wx b;

      public b(wx $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fqp.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fhw> aF_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fju> b() {
         return ImmutableList.of(new fju() {
            @Override
            public fju.a t() {
               return fju.a.b;
            }

            @Override
            public void b(fjw $$0) {
               $$0.a(fjv.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dav.g<T>> {
      fqp.f create(wx var1, List<axr> var2, String var3, T var4);
   }

   public abstract class d extends fqp.f {
      private final List<axr> c;
      protected final List<ffy> a = Lists.newArrayList();

      public d(@Nullable List<axr> $$1, wx $$2) {
         super($$1);
         this.c = fqp.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fhw> aF_() {
         return this.a;
      }

      @Override
      public List<? extends fju> b() {
         return this.a;
      }

      protected void a(ffn $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(fqp.this.m.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(fqp.this.m.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(fqp.this.m.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fqp.d {
      private final fgj d;

      public e(wx $$1, List<axr> $$2, String $$3, dav.d $$4) {
         super($$2, $$1);
         this.d = new fgj(fqp.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fqp.this.b(this);
            } else {
               this.d.g(-65536);
               fqp.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(ffn $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fgg.a<fqp.f> {
      @Nullable
      final List<axr> a;

      public f(@Nullable List<axr> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fgg<fqp.f> {
      private static final int m = 24;

      public g(final dav $$1) {
         super(feb.Q(), fqp.this.n, fqp.this.c.d(), fqp.this.c.c(), 24);
         final Map<dav.b, Map<dav.e<?>, fqp.f>> $$2 = Maps.newHashMap();
         dav.a(new dav.c() {
            @Override
            public void b(dav.e<dav.a> $$0, dav.f<dav.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fqp.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dav.e<dav.d> $$0, dav.f<dav.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fqp.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dav.g<T>> void a(dav.e<T> $$0, fqp.c<T> $$1x) {
               wx $$2 = wx.c($$0.b());
               wx $$3 = wx.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               wx $$6 = wx.a("editGamerule.default", wx.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<axr> $$10;
               String $$11;
               if (gpb.a($$7)) {
                  Builder<axr> $$8 = ImmutableList.builder().add($$3.g());
                  wx $$9 = wx.c($$7);
                  fqp.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fqp.this.new b(wx.c(((dav.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dav.e::a)))
                     .forEach($$0xx -> this.b((fqp.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(ffn $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fqp.f $$4 = this.u();
         if ($$4 != null && $$4.a != null) {
            fqp.this.b($$4.a);
         }
      }
   }
}
