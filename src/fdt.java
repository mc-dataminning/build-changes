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

public class fdt extends ezd {
   private final Consumer<Optional<cqv>> a;
   private fdt.g b;
   private final Set<fdt.f> c = Sets.newHashSet();
   private etj k;
   @Nullable
   private List<ask> l;
   private final cqv m;

   public fdt(cqv $$0, Consumer<Optional<cqv>> $$1) {
      super(ui.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aM_() {
      this.b = new fdt.g(this.m);
      this.e(this.b);
      ews.b $$0 = new ews().a(10).d(2);
      this.k = $$0.a(etj.a(uh.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(etj.a(uh.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         eth var10000 = this.d($$1);
      });
      $$0.a().b(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void aC_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      this.b.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void l() {
      this.k.i = this.c.isEmpty();
   }

   void a(fdt.f $$0) {
      this.c.add($$0);
      this.l();
   }

   void b(fdt.f $$0) {
      this.c.remove($$0);
      this.l();
   }

   public class a extends fdt.d {
      private final etq<Boolean> d;

      public a(ui $$1, List<ask> $$2, String $$3, cqv.a $$4) {
         super($$2, $$1);
         this.d = etq.b($$4.a()).a().a($$1x -> $$1x.b().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fdt.f {
      final ui b;

      public b(ui $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fdt.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends eve> i() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends exa> b() {
         return ImmutableList.of(new exa() {
            @Override
            public exa.a q() {
               return exa.a.b;
            }

            @Override
            public void b(exc $$0) {
               $$0.a(exb.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cqv.g<T>> {
      fdt.f create(ui var1, List<ask> var2, String var3, T var4);
   }

   public abstract class d extends fdt.f {
      private final List<ask> a;
      protected final List<eth> b = Lists.newArrayList();

      public d(@Nullable List<ask> $$1, ui $$2) {
         super($$1);
         this.a = fdt.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends eve> i() {
         return this.b;
      }

      @Override
      public List<? extends exa> b() {
         return this.b;
      }

      protected void a(esy $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fdt.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fdt.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fdt.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fdt.d {
      private final ets d;

      public e(ui $$1, List<ask> $$2, String $$3, cqv.d $$4) {
         super($$2, $$1);
         this.d = new ets(fdt.this.f.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               fdt.this.b(this);
            } else {
               this.d.m(16711680);
               fdt.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends etp.a<fdt.f> {
      @Nullable
      final List<ask> a;

      public f(@Nullable List<ask> $$0) {
         this.a = $$0;
      }
   }

   public class g extends etp<fdt.f> {
      public g(final cqv $$1) {
         super(fdt.this.f, fdt.this.g, fdt.this.h, 43, fdt.this.h - 32, 24);
         final Map<cqv.b, Map<cqv.e<?>, fdt.f>> $$2 = Maps.newHashMap();
         cqv.a(new cqv.c() {
            @Override
            public void b(cqv.e<cqv.a> $$0, cqv.f<cqv.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fdt.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cqv.e<cqv.d> $$0, cqv.f<cqv.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fdt.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cqv.g<T>> void a(cqv.e<T> $$0, fdt.c<T> $$1x) {
               ui $$2 = ui.c($$0.b());
               ui $$3 = ui.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               ui $$6 = ui.a("editGamerule.default", ui.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<ask> $$10;
               String $$11;
               if (gbg.a($$7)) {
                  Builder<ask> $$8 = ImmutableList.builder().add($$3.g());
                  ui $$9 = ui.c($$7);
                  fdt.this.i.c($$9, 150).forEach($$8::add);
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
                  this.b(fdt.this.new b(ui.c(((cqv.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cqv.e::a)))
                     .forEach($$0xx -> this.b((fdt.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void a(esy $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         fdt.f $$4 = this.r();
         if ($$4 != null && $$4.a != null) {
            fdt.this.b($$4.a);
         }
      }
   }
}
