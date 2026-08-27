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

public class fpk extends fkt {
   private static final ws a = ws.c("editGamerule.title");
   private static final int b = 8;
   final fih c = new fih(this);
   private final Consumer<Optional<czq>> d;
   private final Set<fpk.f> r = Sets.newHashSet();
   private final czq s;
   @Nullable
   private fpk.g u;
   @Nullable
   private feu v;

   public fpk(czq $$0, Consumer<Optional<czq>> $$1) {
      super(a);
      this.s = $$0;
      this.d = $$1;
   }

   @Override
   protected void aM_() {
      this.c.a(a, this.p);
      this.u = this.c.c(new fpk.g(this.s));
      fil $$0 = this.c.b(fil.e().a(8));
      this.v = $$0.a(feu.a(wr.d, $$0x -> this.d.accept(Optional.of(this.s))).a());
      $$0.a(feu.a(wr.e, $$0x -> this.d()).a());
      this.c.a($$1 -> {
         fes var10000 = this.c($$1);
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

   void a(fpk.f $$0) {
      this.r.add($$0);
      this.m();
   }

   void b(fpk.f $$0) {
      this.r.remove($$0);
      this.m();
   }

   public class a extends fpk.d {
      private final ffb<Boolean> d;

      public a(ws $$1, List<axi> $$2, String $$3, czq.a $$4) {
         super($$2, $$1);
         this.d = ffb.b($$4.a()).a().a($$1x -> $$1x.d().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fpk.f {
      final ws b;

      public b(ws $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fpk.this.m.h, this.b, $$3 + $$4 / 2, $$2 + 5, -1);
      }

      @Override
      public List<? extends fgq> aE_() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fio> b() {
         return ImmutableList.of(new fio() {
            @Override
            public fio.a t() {
               return fio.a.b;
            }

            @Override
            public void b(fiq $$0) {
               $$0.a(fip.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends czq.g<T>> {
      fpk.f create(ws var1, List<axi> var2, String var3, T var4);
   }

   public abstract class d extends fpk.f {
      private final List<axi> a;
      protected final List<fes> b = Lists.newArrayList();

      public d(@Nullable List<axi> $$1, ws $$2) {
         super($$1);
         this.a = fpk.this.m.h.c($$2, 175);
      }

      @Override
      public List<? extends fgq> aE_() {
         return this.b;
      }

      @Override
      public List<? extends fio> b() {
         return this.b;
      }

      protected void a(feh $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fpk.this.m.h, this.a.get(0), $$2, $$1 + 5, -1, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fpk.this.m.h, this.a.get(0), $$2, $$1, -1, false);
            $$0.a(fpk.this.m.h, this.a.get(1), $$2, $$1 + 10, -1, false);
         }
      }
   }

   public class e extends fpk.d {
      private final ffd d;

      public e(ws $$1, List<axi> $$2, String $$3, czq.d $$4) {
         super($$2, $$1);
         this.d = new ffd(fpk.this.m.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fpk.this.b(this);
            } else {
               this.d.g(-65536);
               fpk.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(feh $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends ffa.a<fpk.f> {
      @Nullable
      final List<axi> a;

      public f(@Nullable List<axi> $$0) {
         this.a = $$0;
      }
   }

   public class g extends ffa<fpk.f> {
      private static final int m = 24;

      public g(final czq $$1) {
         super(fcu.Q(), fpk.this.n, fpk.this.c.d(), fpk.this.c.c(), 24);
         final Map<czq.b, Map<czq.e<?>, fpk.f>> $$2 = Maps.newHashMap();
         czq.a(new czq.c() {
            @Override
            public void b(czq.e<czq.a> $$0, czq.f<czq.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fpk.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(czq.e<czq.d> $$0, czq.f<czq.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fpk.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends czq.g<T>> void a(czq.e<T> $$0, fpk.c<T> $$1x) {
               ws $$2 = ws.c($$0.b());
               ws $$3 = ws.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               ws $$6 = ws.a("editGamerule.default", ws.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<axi> $$10;
               String $$11;
               if (gnt.a($$7)) {
                  Builder<axi> $$8 = ImmutableList.builder().add($$3.g());
                  ws $$9 = ws.c($$7);
                  fpk.this.p.c($$9, 150).forEach($$8::add);
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
                  this.b(fpk.this.new b(ws.c(((czq.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(czq.e::a)))
                     .forEach($$0xx -> this.b((fpk.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(feh $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fpk.f $$4 = this.u();
         if ($$4 != null && $$4.a != null) {
            fpk.this.b($$4.a);
         }
      }
   }
}
