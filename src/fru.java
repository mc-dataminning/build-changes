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

public class fru extends fne {
   private static final xp a = xp.c("editGamerule.title");
   private static final int b = 8;
   final fks c = new fks(this);
   private final Consumer<Optional<dbv>> d;
   private final Set<fru.f> r = Sets.newHashSet();
   private final dbv s;
   @Nullable
   private fru.g u;
   @Nullable
   private fhf v;

   public fru(dbv $$0, Consumer<Optional<dbv>> $$1) {
      super(a);
      this.s = $$0;
      this.d = $$1;
   }

   @Override
   protected void aM_() {
      this.c.a(a, this.p);
      this.u = this.c.c(new fru.g(this.s));
      fkw $$0 = this.c.b(fkw.e().a(8));
      this.v = $$0.a(fhf.a(xo.d, $$0x -> this.d.accept(Optional.of(this.s))).a());
      $$0.a(fhf.a(xo.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fhd var10000 = this.c($$1);
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

   void a(fru.f $$0) {
      this.r.add($$0);
      this.m();
   }

   void b(fru.f $$0) {
      this.r.remove($$0);
      this.m();
   }

   public class a extends fru.d {
      private final fhm<Boolean> c;

      public a(final xp $$1, final List<ayl> $$2, final String $$3, final dbv.a $$4) {
         super($$2, $$1);
         this.c = fhm.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fru.f {
      final xp b;

      public b(final xp $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fru.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fjb> aD_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fkz> b() {
         return ImmutableList.of(new fkz() {
            @Override
            public fkz.a t() {
               return fkz.a.b;
            }

            @Override
            public void b(flb $$0) {
               $$0.a(fla.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dbv.g<T>> {
      fru.f create(xp var1, List<ayl> var2, String var3, T var4);
   }

   public abstract class d extends fru.f {
      private final List<ayl> c;
      protected final List<fhd> a = Lists.newArrayList();

      public d(@Nullable final List<ayl> $$1, final xp $$2) {
         super($$1);
         this.c = fru.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fjb> aD_() {
         return this.a;
      }

      @Override
      public List<? extends fkz> b() {
         return this.a;
      }

      protected void a(fgs $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(fru.this.m.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(fru.this.m.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(fru.this.m.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fru.d {
      private final fho d;

      public e(final xp $$1, final List<ayl> $$2, final String $$3, final dbv.d $$4) {
         super($$2, $$1);
         this.d = new fho(fru.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fru.this.b(this);
            } else {
               this.d.g(-65536);
               fru.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fgs $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fhl.a<fru.f> {
      @Nullable
      final List<ayl> a;

      public f(@Nullable List<ayl> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fhl<fru.f> {
      private static final int m = 24;

      public g(final dbv $$1) {
         super(ffg.Q(), fru.this.n, fru.this.c.d(), fru.this.c.c(), 24);
         final Map<dbv.b, Map<dbv.e<?>, fru.f>> $$2 = Maps.newHashMap();
         dbv.a(new dbv.c() {
            @Override
            public void b(dbv.e<dbv.a> $$0, dbv.f<dbv.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fru.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dbv.e<dbv.d> $$0, dbv.f<dbv.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fru.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dbv.g<T>> void a(dbv.e<T> $$0, fru.c<T> $$1x) {
               xp $$2 = xp.c($$0.b());
               xp $$3 = xp.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               xp $$6 = xp.a("editGamerule.default", xp.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ayl> $$10;
               String $$11;
               if (gqg.a($$7)) {
                  Builder<ayl> $$8 = ImmutableList.builder().add($$3.g());
                  xp $$9 = xp.c($$7);
                  fru.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fru.this.new b(xp.c(((dbv.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dbv.e::a)))
                     .forEach($$0xx -> this.b((fru.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fgs $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fru.f $$4 = this.u();
         if ($$4 != null && $$4.a != null) {
            fru.this.b($$4.a);
         }
      }
   }
}
