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

public class fck extends exz {
   private final Consumer<Optional<cpi>> a;
   private fck.g b;
   private final Set<fck.f> c = Sets.newHashSet();
   private esh k;
   @Nullable
   private List<arc> l;
   private final cpi m;

   public fck(cpi $$0, Consumer<Optional<cpi>> $$1) {
      super(tf.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aE_() {
      this.b = new fck.g(this.m);
      this.e(this.b);
      evn.b $$0 = new evn().a(10).d(2);
      this.k = $$0.a(esh.a(te.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(esh.a(te.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         esf var10000 = this.d($$1);
      });
      $$0.a().b(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void au_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      this.b.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void l() {
      this.k.i = this.c.isEmpty();
   }

   void a(fck.f $$0) {
      this.c.add($$0);
      this.l();
   }

   void b(fck.f $$0) {
      this.c.remove($$0);
      this.l();
   }

   public class a extends fck.d {
      private final eso<Boolean> d;

      public a(tf $$1, List<arc> $$2, String $$3, cpi.a $$4) {
         super($$2, $$1);
         this.d = eso.b($$4.a()).a().a($$1x -> $$1x.b().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.e($$3 + $$4 - 45);
         this.d.f($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fck.f {
      final tf b;

      public b(tf $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fck.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends eua> i() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends evv> b() {
         return ImmutableList.of(new evv() {
            @Override
            public evv.a q() {
               return evv.a.b;
            }

            @Override
            public void b(evx $$0) {
               $$0.a(evw.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cpi.g<T>> {
      fck.f create(tf var1, List<arc> var2, String var3, T var4);
   }

   public abstract class d extends fck.f {
      private final List<arc> a;
      protected final List<esf> b = Lists.newArrayList();

      public d(@Nullable List<arc> $$1, tf $$2) {
         super($$1);
         this.a = fck.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends eua> i() {
         return this.b;
      }

      @Override
      public List<? extends evv> b() {
         return this.b;
      }

      protected void a(erw $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fck.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fck.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fck.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fck.d {
      private final esq d;

      public e(tf $$1, List<arc> $$2, String $$3, cpi.d $$4) {
         super($$2, $$1);
         this.d = new esq(fck.this.f.h, 10, 5, 44, 20, $$1.e().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.l(14737632);
               fck.this.b(this);
            } else {
               this.d.l(16711680);
               fck.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.e($$3 + $$4 - 45);
         this.d.f($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends esn.a<fck.f> {
      @Nullable
      final List<arc> a;

      public f(@Nullable List<arc> $$0) {
         this.a = $$0;
      }
   }

   public class g extends esn<fck.f> {
      public g(final cpi $$1) {
         super(fck.this.f, fck.this.g, fck.this.h, 43, fck.this.h - 32, 24);
         final Map<cpi.b, Map<cpi.e<?>, fck.f>> $$2 = Maps.newHashMap();
         cpi.a(new cpi.c() {
            @Override
            public void b(cpi.e<cpi.a> $$0, cpi.f<cpi.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fck.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cpi.e<cpi.d> $$0, cpi.f<cpi.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fck.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cpi.g<T>> void a(cpi.e<T> $$0, fck.c<T> $$1x) {
               tf $$2 = tf.c($$0.b());
               tf $$3 = tf.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               tf $$6 = tf.a("editGamerule.default", tf.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<arc> $$10;
               String $$11;
               if (fzr.a($$7)) {
                  Builder<arc> $$8 = ImmutableList.builder().add($$3.f());
                  tf $$9 = tf.c($$7);
                  fck.this.i.c($$9, 150).forEach($$8::add);
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
                  this.b(fck.this.new b(tf.c(((cpi.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cpi.e::a)))
                     .forEach($$0xx -> this.b((fck.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void a(erw $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         fck.f $$4 = this.r();
         if ($$4 != null && $$4.a != null) {
            fck.this.b($$4.a);
         }
      }
   }
}
