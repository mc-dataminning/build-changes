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

public class fly extends fhh {
   private final Consumer<Optional<cwx>> a;
   private fly.g b;
   private final Set<fly.f> c = Sets.newHashSet();
   private fbi k;
   @Nullable
   private List<awi> l;
   private final cwx m;

   public fly(cwx $$0, Consumer<Optional<cwx>> $$1) {
      super(vu.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aO_() {
      this.b = this.c(new fly.g(this.m));
      feu.b $$0 = new feu().a(10).d(2);
      this.k = $$0.a(fbi.a(vt.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(fbi.a(vt.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         fbg var10000 = this.c($$1);
      });
      $$0.a().c(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void d() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void o() {
      this.k.j = this.c.isEmpty();
   }

   void a(fly.f $$0) {
      this.c.add($$0);
      this.o();
   }

   void b(fly.f $$0) {
      this.c.remove($$0);
      this.o();
   }

   public class a extends fly.d {
      private final fbp<Boolean> d;

      public a(vu $$1, List<awi> $$2, String $$3, cwx.a $$4) {
         super($$2, $$1);
         this.d = fbp.b($$4.a()).a().a($$1x -> $$1x.d().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fly.f {
      final vu b;

      public b(vu $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fly.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends fde> l() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends ffc> a() {
         return ImmutableList.of(new ffc() {
            @Override
            public ffc.a s() {
               return ffc.a.b;
            }

            @Override
            public void b(ffe $$0) {
               $$0.a(ffd.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cwx.g<T>> {
      fly.f create(vu var1, List<awi> var2, String var3, T var4);
   }

   public abstract class d extends fly.f {
      private final List<awi> a;
      protected final List<fbg> b = Lists.newArrayList();

      public d(@Nullable List<awi> $$1, vu $$2) {
         super($$1);
         this.a = fly.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends fde> l() {
         return this.b;
      }

      @Override
      public List<? extends ffc> a() {
         return this.b;
      }

      protected void a(fav $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fly.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fly.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fly.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fly.d {
      private final fbr d;

      public e(vu $$1, List<awi> $$2, String $$3, cwx.d $$4) {
         super($$2, $$1);
         this.d = new fbr(fly.this.f.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fly.this.b(this);
            } else {
               this.d.g(16711680);
               fly.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(fav $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.m($$3 + $$4 - 45);
         this.d.n($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends fbo.a<fly.f> {
      @Nullable
      final List<awi> a;

      public f(@Nullable List<awi> $$0) {
         this.a = $$0;
      }
   }

   public class g extends fbo<fly.f> {
      public g(final cwx $$1) {
         super(fly.this.f, fly.this.g, fly.this.h - 75, 43, 24);
         final Map<cwx.b, Map<cwx.e<?>, fly.f>> $$2 = Maps.newHashMap();
         cwx.a(new cwx.c() {
            @Override
            public void b(cwx.e<cwx.a> $$0, cwx.f<cwx.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fly.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cwx.e<cwx.d> $$0, cwx.f<cwx.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fly.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cwx.g<T>> void a(cwx.e<T> $$0, fly.c<T> $$1x) {
               vu $$2 = vu.c($$0.b());
               vu $$3 = vu.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               vu $$6 = vu.a("editGamerule.default", vu.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<awi> $$10;
               String $$11;
               if (gkh.a($$7)) {
                  Builder<awi> $$8 = ImmutableList.builder().add($$3.g());
                  vu $$9 = vu.c($$7);
                  fly.this.i.c($$9, 150).forEach($$8::add);
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
                  this.b(fly.this.new b(vu.c(((cwx.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cwx.e::a)))
                     .forEach($$0xx -> this.b((fly.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(fav $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fly.f $$4 = this.t();
         if ($$4 != null && $$4.a != null) {
            fly.this.b($$4.a);
         }
      }
   }
}
