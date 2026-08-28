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

public class frv extends fnf {
   private static final xp a = xp.c("editGamerule.title");
   private static final int b = 8;
   final fkt c = new fkt(this);
   private final Consumer<Optional<dbw>> d;
   private final Set<frv.f> r = Sets.newHashSet();
   private final dbw s;
   @Nullable
   private frv.g u;
   @Nullable
   private fhg v;

   public frv(dbw $$0, Consumer<Optional<dbw>> $$1) {
      super(a);
      this.s = $$0;
      this.d = $$1;
   }

   @Override
   protected void aM_() {
      this.c.a(a, this.p);
      this.u = this.c.c(new frv.g(this.s));
      fkx $$0 = this.c.b(fkx.e().a(8));
      this.v = $$0.a(fhg.a(xo.d, $$0x -> this.d.accept(Optional.of(this.s))).a());
      $$0.a(fhg.a(xo.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fhe var10000 = this.c($$1);
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

   void a(frv.f $$0) {
      this.r.add($$0);
      this.m();
   }

   void b(frv.f $$0) {
      this.r.remove($$0);
      this.m();
   }

   public class a extends frv.d {
      private final fhn<Boolean> c;

      public a(final xp $$1, final List<ayl> $$2, final String $$3, final dbw.a $$4) {
         super($$2, $$1);
         this.c = fhn.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends frv.f {
      final xp b;

      public b(final xp $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(frv.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fjc> aD_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fla> b() {
         return ImmutableList.of(new fla() {
            @Override
            public fla.a t() {
               return fla.a.b;
            }

            @Override
            public void b(flc $$0) {
               $$0.a(flb.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dbw.g<T>> {
      frv.f create(xp var1, List<ayl> var2, String var3, T var4);
   }

   public abstract class d extends frv.f {
      private final List<ayl> c;
      protected final List<fhe> a = Lists.newArrayList();

      public d(@Nullable final List<ayl> $$1, final xp $$2) {
         super($$1);
         this.c = frv.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fjc> aD_() {
         return this.a;
      }

      @Override
      public List<? extends fla> b() {
         return this.a;
      }

      protected void a(fgt $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(frv.this.m.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(frv.this.m.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(frv.this.m.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends frv.d {
      private final fhp d;

      public e(final xp $$1, final List<ayl> $$2, final String $$3, final dbw.d $$4) {
         super($$2, $$1);
         this.d = new fhp(frv.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               frv.this.b(this);
            } else {
               this.d.g(-65536);
               frv.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fgt $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fhm.a<frv.f> {
      @Nullable
      final List<ayl> a;

      public f(@Nullable List<ayl> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fhm<frv.f> {
      private static final int m = 24;

      public g(final dbw $$1) {
         super(ffh.Q(), frv.this.n, frv.this.c.d(), frv.this.c.c(), 24);
         final Map<dbw.b, Map<dbw.e<?>, frv.f>> $$2 = Maps.newHashMap();
         dbw.a(new dbw.c() {
            @Override
            public void b(dbw.e<dbw.a> $$0, dbw.f<dbw.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> frv.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dbw.e<dbw.d> $$0, dbw.f<dbw.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> frv.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dbw.g<T>> void a(dbw.e<T> $$0, frv.c<T> $$1x) {
               xp $$2 = xp.c($$0.b());
               xp $$3 = xp.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               xp $$6 = xp.a("editGamerule.default", xp.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayl> $$10;
               String $$11;
               if (gqh.a($$7)) {
                  Builder<ayl> $$8 = ImmutableList.builder().add($$3.g());
                  xp $$9 = xp.c($$7);
                  frv.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(frv.this.new b(xp.c(((dbw.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dbw.e::a)))
                     .forEach($$0xx -> this.b((frv.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fgt $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         frv.f $$4 = this.u();
         if ($$4 != null && $$4.a != null) {
            frv.this.b($$4.a);
         }
      }
   }
}
