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

public class fcp extends eya {
   private final Consumer<Optional<cph>> a;
   private fcp.g b;
   private final Set<fcp.f> c = Sets.newHashSet();
   private esg k;
   @Nullable
   private List<arc> l;
   private final cph m;

   public fcp(cph $$0, Consumer<Optional<cph>> $$1) {
      super(tf.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aC_() {
      this.b = new fcp.g(this.m);
      this.e(this.b);
      evo.b $$0 = new evo().a(10).d(2);
      this.k = $$0.a(esg.a(te.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(esg.a(te.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         ese var10000 = this.d($$1);
      });
      $$0.a().b(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void at_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      this.b.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void l() {
      this.k.i = this.c.isEmpty();
   }

   void a(fcp.f $$0) {
      this.c.add($$0);
      this.l();
   }

   void b(fcp.f $$0) {
      this.c.remove($$0);
      this.l();
   }

   public class a extends fcp.d {
      private final esn<Boolean> d;

      public a(tf $$1, List<arc> $$2, String $$3, cph.a $$4) {
         super($$2, $$1);
         this.d = esn.b($$4.a()).a().a($$1x -> $$1x.b().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fcp.f {
      final tf b;

      public b(tf $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fcp.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends eua> i() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends evw> b() {
         return ImmutableList.of(new evw() {
            @Override
            public evw.a q() {
               return evw.a.b;
            }

            @Override
            public void b(evy $$0) {
               $$0.a(evx.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cph.g<T>> {
      fcp.f create(tf var1, List<arc> var2, String var3, T var4);
   }

   public abstract class d extends fcp.f {
      private final List<arc> a;
      protected final List<ese> b = Lists.newArrayList();

      public d(@Nullable List<arc> $$1, tf $$2) {
         super($$1);
         this.a = fcp.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends eua> i() {
         return this.b;
      }

      @Override
      public List<? extends evw> b() {
         return this.b;
      }

      protected void a(erv $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fcp.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fcp.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fcp.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fcp.d {
      private final esp d;

      public e(tf $$1, List<arc> $$2, String $$3, cph.d $$4) {
         super($$2, $$1);
         this.d = new esp(fcp.this.f.h, 10, 5, 44, 20, $$1.e().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               fcp.this.b(this);
            } else {
               this.d.m(16711680);
               fcp.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(erv $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends esm.a<fcp.f> {
      @Nullable
      final List<arc> a;

      public f(@Nullable List<arc> $$0) {
         this.a = $$0;
      }
   }

   public class g extends esm<fcp.f> {
      public g(final cph $$1) {
         super(fcp.this.f, fcp.this.g, fcp.this.h, 43, fcp.this.h - 32, 24);
         final Map<cph.b, Map<cph.e<?>, fcp.f>> $$2 = Maps.newHashMap();
         cph.a(new cph.c() {
            @Override
            public void b(cph.e<cph.a> $$0, cph.f<cph.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fcp.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cph.e<cph.d> $$0, cph.f<cph.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fcp.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cph.g<T>> void a(cph.e<T> $$0, fcp.c<T> $$1x) {
               tf $$2 = tf.c($$0.b());
               tf $$3 = tf.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               tf $$6 = tf.a("editGamerule.default", tf.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<arc> $$10;
               String $$11;
               if (gaa.a($$7)) {
                  Builder<arc> $$8 = ImmutableList.builder().add($$3.f());
                  tf $$9 = tf.c($$7);
                  fcp.this.i.c($$9, 150).forEach($$8::add);
                  $$10 = $$8.add($$6.f()).build();
                  $$11 = $$9.getString() + "\n" + $$6.getString();
               } else {
                  $$10 = ImmutableList.of($$3.f(), $$6.f());
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
                  this.b(fcp.this.new b(tf.c(((cph.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cph.e::a)))
                     .forEach($$0xx -> this.b((fcp.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void a(erv $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         fcp.f $$4 = this.r();
         if ($$4 != null && $$4.a != null) {
            fcp.this.b($$4.a);
         }
      }
   }
}
