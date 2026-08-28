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

public class fsj extends fnl {
   private static final wu a = wu.c("editGamerule.title");
   private static final int b = 8;
   final flh c = new flh(this);
   private final Consumer<Optional<dcc>> q;
   private final Set<fsj.f> r = Sets.newHashSet();
   private final dcc s;
   @Nullable
   private fsj.g u;
   @Nullable
   private fhu v;

   public fsj(dcc $$0, Consumer<Optional<dcc>> $$1) {
      super(a);
      this.s = $$0;
      this.q = $$1;
   }

   @Override
   protected void aP_() {
      this.c.a(a, this.o);
      this.u = this.c.c(new fsj.g(this.s));
      fll $$0 = this.c.b(fll.e().a(8));
      this.v = $$0.a(fhu.a(wt.d, $$0x -> this.q.accept(Optional.of(this.s))).a());
      $$0.a(fhu.a(wt.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fhs var10000 = this.c($$1);
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

   void a(fsj.f $$0) {
      this.r.add($$0);
      this.m();
   }

   void b(fsj.f $$0) {
      this.r.remove($$0);
      this.m();
   }

   public class a extends fsj.d {
      private final fib<Boolean> c;

      public a(final wu $$1, final List<axs> $$2, final String $$3, final dcc.a $$4) {
         super($$2, $$1);
         this.c = fib.b($$4.a()).a().a($$1x -> $$1x.c().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.a.add(this.c);
      }

      @Override
      public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.c.m($$3 + $$4 - 45);
         this.c.n($$2);
         this.c.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fsj.f {
      final wu b;

      public b(final wu $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fsj.this.l.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fjq> aG_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends flo> b() {
         return ImmutableList.of(new flo() {
            @Override
            public flo.a u() {
               return flo.a.b;
            }

            @Override
            public void b(flq $$0) {
               $$0.a(flp.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends dcc.g<T>> {
      fsj.f create(wu var1, List<axs> var2, String var3, T var4);
   }

   public abstract class d extends fsj.f {
      private final List<axs> c;
      protected final List<fhs> a = Lists.newArrayList();

      public d(@Nullable final List<axs> $$1, final wu $$2) {
         super($$1);
         this.c = fsj.this.l.h.c($$2, 175);
      }

      @Override
      public List<? extends fjq> aG_() {
         return this.a;
      }

      @Override
      public List<? extends flo> b() {
         return this.a;
      }

      protected void a(fhh $$0, int $$1, int $$2) {
         if (this.c.size() == 1) {
            $$0.a(fsj.this.l.h, this.c.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.c.size() >= 2) {
            $$0.a(fsj.this.l.h, this.c.get(0), $$2, $$1, -1, false);
            $$0.a(fsj.this.l.h, this.c.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fsj.d {
      private final fid d;

      public e(final wu $$1, final List<axs> $$2, final String $$3, final dcc.d $$4) {
         super($$2, $$1);
         this.d = new fid(fsj.this.l.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fsj.this.b(this);
            } else {
               this.d.g(-65536);
               fsj.this.a(this);
            }
         });
         this.a.add(this.d);
      }

      @Override
      public void a(fhh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fia.a<fsj.f> {
      @Nullable
      final List<axs> a;

      public f(@Nullable List<axs> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fia<fsj.f> {
      private static final int m = 24;

      public g(final dcc $$1) {
         super(ffw.Q(), fsj.this.m, fsj.this.c.d(), fsj.this.c.c(), 24);
         final Map<dcc.b, Map<dcc.e<?>, fsj.f>> $$2 = Maps.newHashMap();
         dcc.a(new dcc.c() {
            @Override
            public void b(dcc.e<dcc.a> $$0, dcc.f<dcc.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fsj.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(dcc.e<dcc.d> $$0, dcc.f<dcc.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fsj.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends dcc.g<T>> void a(dcc.e<T> $$0, fsj.c<T> $$1x) {
               wu $$2 = wu.c($$0.b());
               wu $$3 = wu.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               wu $$6 = wu.a("editGamerule.default", wu.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<axs> $$10;
               String $$11;
               if (gqw.a($$7)) {
                  Builder<axs> $$8 = ImmutableList.builder().add($$3.g());
                  wu $$9 = wu.c($$7);
                  fsj.this.o.c($$9, 150).forEach($$8::add);
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
                  this.b(fsj.this.new b(wu.c(((dcc.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(dcc.e::a)))
                     .forEach($$0xx -> this.b((fsj.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fhh $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fsj.f $$4 = this.v();
         if ($$4 != null && $$4.a != null) {
            fsj.this.b($$4.a);
         }
      }
   }
}
