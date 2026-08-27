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

public class fpu extends fld {
   private static final wu a = wu.c("editGamerule.title");
   private static final int b = 8;
   final fir c = new fir(this);
   private final Consumer<Optional<czz>> d;
   private final Set<fpu.f> r = Sets.newHashSet();
   private final czz s;
   @Nullable
   private fpu.g u;
   @Nullable
   private ffe v;

   public fpu(czz $$0, Consumer<Optional<czz>> $$1) {
      super(a);
      this.s = $$0;
      this.d = $$1;
   }

   @Override
   protected void aM_() {
      this.c.a(a, this.p);
      this.u = this.c.c(new fpu.g(this.s));
      fiv $$0 = this.c.b(fiv.e().a(8));
      this.v = $$0.a(ffe.a(wt.d, $$0x -> this.d.accept(Optional.of(this.s))).a());
      $$0.a(ffe.a(wt.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         ffc var10000 = this.c($$1);
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

   void a(fpu.f $$0) {
      this.r.add($$0);
      this.m();
   }

   void b(fpu.f $$0) {
      this.r.remove($$0);
      this.m();
   }

   public class a extends fpu.d {
      private final ffl<Boolean> d;

      public a(wu $$1, List<axl> $$2, String $$3, czz.a $$4) {
         super($$2, $$1);
         this.d = ffl.b($$4.a()).a().a($$1x -> $$1x.d().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fpu.f {
      final wu b;

      public b(wu $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fpu.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fha> aE_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fiy> b() {
         return ImmutableList.of(new fiy() {
            @Override
            public fiy.a t() {
               return fiy.a.b;
            }

            @Override
            public void b(fja $$0) {
               $$0.a(fiz.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends czz.g<T>> {
      fpu.f create(wu var1, List<axl> var2, String var3, T var4);
   }

   public abstract class d extends fpu.f {
      private final List<axl> a;
      protected final List<ffc> b = Lists.newArrayList();

      public d(@Nullable List<axl> $$1, wu $$2) {
         super($$1);
         this.a = fpu.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fha> aE_() {
         return this.b;
      }

      @Override
      public List<? extends fiy> b() {
         return this.b;
      }

      protected void a(fer $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fpu.this.m.h, this.a.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fpu.this.m.h, this.a.get(0), $$2, $$1, -1, false);
            $$0.a(fpu.this.m.h, this.a.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fpu.d {
      private final ffn d;

      public e(wu $$1, List<axl> $$2, String $$3, czz.d $$4) {
         super($$2, $$1);
         this.d = new ffn(fpu.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fpu.this.b(this);
            } else {
               this.d.g(-65536);
               fpu.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends ffk.a<fpu.f> {
      @Nullable
      final List<axl> a;

      public f(@Nullable List<axl> $$0) {
         this.a = $$0;
      }
   }

   public class g extends ffk<fpu.f> {
      private static final int m = 24;

      public g(final czz $$1) {
         super(fde.Q(), fpu.this.n, fpu.this.c.d(), fpu.this.c.c(), 24);
         final Map<czz.b, Map<czz.e<?>, fpu.f>> $$2 = Maps.newHashMap();
         czz.a(new czz.c() {
            @Override
            public void b(czz.e<czz.a> $$0, czz.f<czz.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fpu.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(czz.e<czz.d> $$0, czz.f<czz.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fpu.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends czz.g<T>> void a(czz.e<T> $$0, fpu.c<T> $$1x) {
               wu $$2 = wu.c($$0.b());
               wu $$3 = wu.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               wu $$6 = wu.a("editGamerule.default", wu.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<axl> $$10;
               String $$11;
               if (goe.a($$7)) {
                  Builder<axl> $$8 = ImmutableList.builder().add($$3.g());
                  wu $$9 = wu.c($$7);
                  fpu.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fpu.this.new b(wu.c(((czz.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(czz.e::a)))
                     .forEach($$0xx -> this.b((fpu.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fer $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fpu.f $$4 = this.u();
         if ($$4 != null && $$4.a != null) {
            fpu.this.b($$4.a);
         }
      }
   }
}
