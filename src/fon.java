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

public class fon extends fjx {
   private static final wi a = wi.c("editGamerule.title");
   private static final int b = 8;
   final fhl c = new fhl(this);
   private final Consumer<Optional<czc>> d;
   private final Set<fon.f> o = Sets.newHashSet();
   @Nullable
   private fdy p;
   private final czc q;

   public fon(czc $$0, Consumer<Optional<czc>> $$1) {
      super(a);
      this.q = $$0;
      this.d = $$1;
   }

   @Override
   protected void aM_() {
      this.c.a(a, this.m);
      this.c.c(new fon.g(this.q));
      fhp $$0 = this.c.b(fhp.e().a(8));
      this.p = $$0.a(fdy.a(wh.d, $$0x -> this.d.accept(Optional.of(this.q))).a());
      $$0.a(fdy.a(wh.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fdw var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.c.a();
   }

   @Override
   public void d() {
      this.d.accept(Optional.empty());
   }

   private void m() {
      if (this.p != null) {
         this.p.j = this.o.isEmpty();
      }
   }

   void a(fon.f $$0) {
      this.o.add($$0);
      this.m();
   }

   void b(fon.f $$0) {
      this.o.remove($$0);
      this.m();
   }

   public class a extends fon.d {
      private final fef<Boolean> d;

      public a(wi $$1, List<awy> $$2, String $$3, czc.a $$4) {
         super($$2, $$1);
         this.d = fef.b($$4.a()).a().a($$1x -> $$1x.d().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fon.f {
      final wi b;

      public b(wi $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fon.this.j.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends ffu> aE_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fhs> b() {
         return ImmutableList.of(new fhs() {
            @Override
            public fhs.a t() {
               return fhs.a.b;
            }

            @Override
            public void b(fhu $$0) {
               $$0.a(fht.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends czc.g<T>> {
      fon.f create(wi var1, List<awy> var2, String var3, T var4);
   }

   public abstract class d extends fon.f {
      private final List<awy> a;
      protected final List<fdw> b = Lists.newArrayList();

      public d(@Nullable List<awy> $$1, wi $$2) {
         super($$1);
         this.a = fon.this.j.h.c($$2, 175);
      }

      @Override
      public List<? extends ffu> aE_() {
         return this.b;
      }

      @Override
      public List<? extends fhs> b() {
         return this.b;
      }

      protected void a(fdl $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fon.this.j.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fon.this.j.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fon.this.j.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fon.d {
      private final feh d;

      public e(wi $$1, List<awy> $$2, String $$3, czc.d $$4) {
         super($$2, $$1);
         this.d = new feh(fon.this.j.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fon.this.b(this);
            } else {
               this.d.g(16711680);
               fon.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(fdl $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fee.a<fon.f> {
      @Nullable
      final List<awy> a;

      public f(@Nullable List<awy> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fee<fon.f> {
      private static final int m = 24;

      public g(final czc $$1) {
         super(fby.Q(), fon.this.k, fon.this.c.d(), fon.this.c.c(), 24);
         final Map<czc.b, Map<czc.e<?>, fon.f>> $$2 = Maps.newHashMap();
         czc.a(new czc.c() {
            @Override
            public void b(czc.e<czc.a> $$0, czc.f<czc.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fon.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(czc.e<czc.d> $$0, czc.f<czc.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fon.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends czc.g<T>> void a(czc.e<T> $$0, fon.c<T> $$1x) {
               wi $$2 = wi.c($$0.b());
               wi $$3 = wi.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               wi $$6 = wi.a("editGamerule.default", wi.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<awy> $$10;
               String $$11;
               if (gmx.a($$7)) {
                  Builder<awy> $$8 = ImmutableList.builder().add($$3.g());
                  wi $$9 = wi.c($$7);
                  fon.this.m.c($$9, 150).forEach($$8::add);
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
                  this.b(fon.this.new b(wi.c(((czc.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(czc.e::a)))
                     .forEach($$0xx -> this.b((fon.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fdl $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fon.f $$4 = this.u();
         if ($$4 != null && $$4.a != null) {
            fon.this.b($$4.a);
         }
      }
   }
}
