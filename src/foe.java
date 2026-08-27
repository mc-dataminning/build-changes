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

public class foe extends fjo {
   private static final wg a = wg.c("editGamerule.title");
   private static final int b = 8;
   final fhc c = new fhc(this);
   private final Consumer<Optional<cyt>> d;
   private final Set<foe.f> o = Sets.newHashSet();
   @Nullable
   private fdp p;
   private final cyt q;

   public foe(cyt $$0, Consumer<Optional<cyt>> $$1) {
      super(a);
      this.q = $$0;
      this.d = $$1;
   }

   @Override
   protected void aN_() {
      this.c.a(a, this.m);
      this.c.c(new foe.g(this.q));
      fhg $$0 = this.c.b(fhg.e().a(8));
      this.p = $$0.a(fdp.a(wf.d, $$0x -> this.d.accept(Optional.of(this.q))).a());
      $$0.a(fdp.a(wf.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fdn var10000 = this.c($$1);
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

   void a(foe.f $$0) {
      this.o.add($$0);
      this.m();
   }

   void b(foe.f $$0) {
      this.o.remove($$0);
      this.m();
   }

   public class a extends foe.d {
      private final fdw<Boolean> d;

      public a(wg $$1, List<aww> $$2, String $$3, cyt.a $$4) {
         super($$2, $$1);
         this.d = fdw.b($$4.a()).a().a($$1x -> $$1x.d().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends foe.f {
      final wg b;

      public b(wg $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(foe.this.j.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends ffl> aF_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fhj> b() {
         return ImmutableList.of(new fhj() {
            @Override
            public fhj.a t() {
               return fhj.a.b;
            }

            @Override
            public void b(fhl $$0) {
               $$0.a(fhk.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cyt.g<T>> {
      foe.f create(wg var1, List<aww> var2, String var3, T var4);
   }

   public abstract class d extends foe.f {
      private final List<aww> a;
      protected final List<fdn> b = Lists.newArrayList();

      public d(@Nullable List<aww> $$1, wg $$2) {
         super($$1);
         this.a = foe.this.j.h.c($$2, 175);
      }

      @Override
      public List<? extends ffl> aF_() {
         return this.b;
      }

      @Override
      public List<? extends fhj> b() {
         return this.b;
      }

      protected void a(fdc $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(foe.this.j.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(foe.this.j.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(foe.this.j.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends foe.d {
      private final fdy d;

      public e(wg $$1, List<aww> $$2, String $$3, cyt.d $$4) {
         super($$2, $$1);
         this.d = new fdy(foe.this.j.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               foe.this.b(this);
            } else {
               this.d.g(16711680);
               foe.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fdv.a<foe.f> {
      @Nullable
      final List<aww> a;

      public f(@Nullable List<aww> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fdv<foe.f> {
      private static final int m = 24;

      public g(final cyt $$1) {
         super(fbp.Q(), foe.this.k, foe.this.c.d(), foe.this.c.c(), 24);
         final Map<cyt.b, Map<cyt.e<?>, foe.f>> $$2 = Maps.newHashMap();
         cyt.a(new cyt.c() {
            @Override
            public void b(cyt.e<cyt.a> $$0, cyt.f<cyt.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> foe.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cyt.e<cyt.d> $$0, cyt.f<cyt.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> foe.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cyt.g<T>> void a(cyt.e<T> $$0, foe.c<T> $$1x) {
               wg $$2 = wg.c($$0.b());
               wg $$3 = wg.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               wg $$6 = wg.a("editGamerule.default", wg.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<aww> $$10;
               String $$11;
               if (gmo.a($$7)) {
                  Builder<aww> $$8 = ImmutableList.builder().add($$3.g());
                  wg $$9 = wg.c($$7);
                  foe.this.m.c($$9, 150).forEach($$8::add);
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
                  this.b(foe.this.new b(wg.c(((cyt.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cyt.e::a)))
                     .forEach($$0xx -> this.b((foe.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fdc $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         foe.f $$4 = this.u();
         if ($$4 != null && $$4.a != null) {
            foe.this.b($$4.a);
         }
      }
   }
}
