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

public class flw extends fhf {
   private final Consumer<Optional<cwv>> a;
   private flw.g b;
   private final Set<flw.f> c = Sets.newHashSet();
   private fbg k;
   @Nullable
   private List<awi> l;
   private final cwv m;

   public flw(cwv $$0, Consumer<Optional<cwv>> $$1) {
      super(vu.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aO_() {
      this.b = this.c(new flw.g(this.m));
      fes.b $$0 = new fes().a(10).d(2);
      this.k = $$0.a(fbg.a(vt.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(fbg.a(vt.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         fbe var10000 = this.c($$1);
      });
      $$0.a().c(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void d() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void o() {
      this.k.j = this.c.isEmpty();
   }

   void a(flw.f $$0) {
      this.c.add($$0);
      this.o();
   }

   void b(flw.f $$0) {
      this.c.remove($$0);
      this.o();
   }

   public class a extends flw.d {
      private final fbn<Boolean> d;

      public a(vu $$1, List<awi> $$2, String $$3, cwv.a $$4) {
         super($$2, $$1);
         this.d = fbn.b($$4.a()).a().a($$1x -> $$1x.d().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends flw.f {
      final vu b;

      public b(vu $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(flw.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends fdc> l() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends ffa> a() {
         return ImmutableList.of(new ffa() {
            @Override
            public ffa.a s() {
               return ffa.a.b;
            }

            @Override
            public void b(ffc $$0) {
               $$0.a(ffb.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cwv.g<T>> {
      flw.f create(vu var1, List<awi> var2, String var3, T var4);
   }

   public abstract class d extends flw.f {
      private final List<awi> a;
      protected final List<fbe> b = Lists.newArrayList();

      public d(@Nullable List<awi> $$1, vu $$2) {
         super($$1);
         this.a = flw.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends fdc> l() {
         return this.b;
      }

      @Override
      public List<? extends ffa> a() {
         return this.b;
      }

      protected void a(fat $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(flw.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(flw.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(flw.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends flw.d {
      private final fbp d;

      public e(vu $$1, List<awi> $$2, String $$3, cwv.d $$4) {
         super($$2, $$1);
         this.d = new fbp(flw.this.f.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               flw.this.b(this);
            } else {
               this.d.g(16711680);
               flw.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(fat $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fbm.a<flw.f> {
      @Nullable
      final List<awi> a;

      public f(@Nullable List<awi> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fbm<flw.f> {
      public g(final cwv $$1) {
         super(flw.this.f, flw.this.g, flw.this.h - 75, 43, 24);
         final Map<cwv.b, Map<cwv.e<?>, flw.f>> $$2 = Maps.newHashMap();
         cwv.a(new cwv.c() {
            @Override
            public void b(cwv.e<cwv.a> $$0, cwv.f<cwv.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> flw.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cwv.e<cwv.d> $$0, cwv.f<cwv.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> flw.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cwv.g<T>> void a(cwv.e<T> $$0, flw.c<T> $$1x) {
               vu $$2 = vu.c($$0.b());
               vu $$3 = vu.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               vu $$6 = vu.a("editGamerule.default", vu.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<awi> $$10;
               String $$11;
               if (gke.a($$7)) {
                  Builder<awi> $$8 = ImmutableList.builder().add($$3.g());
                  vu $$9 = vu.c($$7);
                  flw.this.i.c($$9, 150).forEach($$8::add);
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
                  this.b(flw.this.new b(vu.c(((cwv.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cwv.e::a)))
                     .forEach($$0xx -> this.b((flw.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fat $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         flw.f $$4 = this.t();
         if ($$4 != null && $$4.a != null) {
            flw.this.b($$4.a);
         }
      }
   }
}
