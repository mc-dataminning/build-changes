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

public class ftb extends fob {
   private static final wz a = wz.c("editGamerule.title");
   private static final int b = 8;
   final flx c = new flx(this);
   private final Consumer<Optional<dcs>> r;
   private final Set<ftb.f> s = Sets.newHashSet();
   private final dcs u;
   @Nullable
   private ftb.g v;
   @Nullable
   private fik w;

   public ftb(dcs $$0, Consumer<Optional<dcs>> $$1) {
      super(a);
      this.u = $$0;
      this.r = $$1;
   }

   @Override
   protected void aT_() {
      this.c.a(a, this.o);
      this.v = this.c.c(new ftb.g(this.u));
      fmb $$0 = this.c.b(fmb.e().a(8));
      this.w = $$0.a(fik.a(wy.d, $$0x -> this.r.accept(Optional.of(this.u))).a());
      $$0.a(fik.a(wy.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fii var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
      if (this.v != null) {
         this.v.a(this.m, this.c);
      }
   }

   @Override
   public void d() {
      this.r.accept(Optional.empty());
   }

   private void m() {
      if (this.w != null) {
         this.w.j = this.s.isEmpty();
      }
   }

   void a(ftb.f $$0) {
      this.s.add($$0);
      this.m();
   }

   void b(ftb.f $$0) {
      this.s.remove($$0);
      this.m();
   }

   public class a extends ftb.d {
      private final fir<Boolean> c;

      public a(final wz $$1, final List<aya> $$2, final String $$3, final dcs.a $$4) {
         super($$2, $$1);
         this.c = fir.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends ftb.f {
      final wz b;

      public b(final wz $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(ftb.this.l.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fkg> aK_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fme> b() {
         return ImmutableList.of(new fme() {
            @Override
            public fme.a u() {
               return fme.a.b;
            }

            @Override
            public void b(fmg $$0) {
               $$0.a(fmf.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dcs.g<T>> {
      ftb.f create(wz var1, List<aya> var2, String var3, T var4);
   }

   public abstract class d extends ftb.f {
      private final List<aya> c;
      protected final List<fii> a = Lists.newArrayList();

      public d(@Nullable final List<aya> $$1, final wz $$2) {
         super($$1);
         this.c = ftb.this.l.h.c($$2, 175);
      }

      @Override
      public List<? extends fkg> aK_() {
         return this.a;
      }

      @Override
      public List<? extends fme> b() {
         return this.a;
      }

      protected void a(fhx $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(ftb.this.l.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(ftb.this.l.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(ftb.this.l.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends ftb.d {
      private final fit d;

      public e(final wz $$1, final List<aya> $$2, final String $$3, final dcs.d $$4) {
         super($$2, $$1);
         this.d = new fit(ftb.this.l.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               ftb.this.b(this);
            } else {
               this.d.g(-65536);
               ftb.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fhx $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fiq.a<ftb.f> {
      @Nullable
      final List<aya> a;

      public f(@Nullable List<aya> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fiq<ftb.f> {
      private static final int m = 24;

      public g(final dcs $$1) {
         super(fgm.Q(), ftb.this.m, ftb.this.c.d(), ftb.this.c.c(), 24);
         final Map<dcs.b, Map<dcs.e<?>, ftb.f>> $$2 = Maps.newHashMap();
         dcs.a(new dcs.c() {
            @Override
            public void b(dcs.e<dcs.a> $$0, dcs.f<dcs.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> ftb.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dcs.e<dcs.d> $$0, dcs.f<dcs.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> ftb.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dcs.g<T>> void a(dcs.e<T> $$0, ftb.c<T> $$1x) {
               wz $$2 = wz.c($$0.b());
               wz $$3 = wz.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               wz $$6 = wz.a("editGamerule.default", wz.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<aya> $$10;
               String $$11;
               if (grp.a($$7)) {
                  Builder<aya> $$8 = ImmutableList.builder().add($$3.g());
                  wz $$9 = wz.c($$7);
                  ftb.this.o.c($$9, 150).forEach($$8::add);
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
                  this.b(ftb.this.new b(wz.c(((dcs.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dcs.e::a)))
                     .forEach($$0xx -> this.b((ftb.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fhx $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         ftb.f $$4 = this.v();
         if ($$4 != null && $$4.a != null) {
            ftb.this.b($$4.a);
         }
      }
   }
}
