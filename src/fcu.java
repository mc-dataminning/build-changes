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

public class fcu extends eye {
   private final Consumer<Optional<cpx>> a;
   private fcu.g b;
   private final Set<fcu.f> c = Sets.newHashSet();
   private esk k;
   @Nullable
   private List<arn> l;
   private final cpx m;

   public fcu(cpx $$0, Consumer<Optional<cpx>> $$1) {
      super(tl.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aH_() {
      this.b = new fcu.g(this.m);
      this.e(this.b);
      evt.b $$0 = new evt().a(10).d(2);
      this.k = $$0.a(esk.a(tk.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(esk.a(tk.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         esi var10000 = this.d($$1);
      });
      $$0.a().b(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void az_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      this.b.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void l() {
      this.k.i = this.c.isEmpty();
   }

   void a(fcu.f $$0) {
      this.c.add($$0);
      this.l();
   }

   void b(fcu.f $$0) {
      this.c.remove($$0);
      this.l();
   }

   public class a extends fcu.d {
      private final esr<Boolean> d;

      public a(tl $$1, List<arn> $$2, String $$3, cpx.a $$4) {
         super($$2, $$1);
         this.d = esr.b($$4.a()).a().a($$1x -> $$1x.b().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fcu.f {
      final tl b;

      public b(tl $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fcu.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends euf> i() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends ewb> b() {
         return ImmutableList.of(new ewb() {
            @Override
            public ewb.a q() {
               return ewb.a.b;
            }

            @Override
            public void b(ewd $$0) {
               $$0.a(ewc.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends cpx.g<T>> {
      fcu.f create(tl var1, List<arn> var2, String var3, T var4);
   }

   public abstract class d extends fcu.f {
      private final List<arn> a;
      protected final List<esi> b = Lists.newArrayList();

      public d(@Nullable List<arn> $$1, tl $$2) {
         super($$1);
         this.a = fcu.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends euf> i() {
         return this.b;
      }

      @Override
      public List<? extends ewb> b() {
         return this.b;
      }

      protected void a(erz $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fcu.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fcu.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fcu.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fcu.d {
      private final est d;

      public e(tl $$1, List<arn> $$2, String $$3, cpx.d $$4) {
         super($$2, $$1);
         this.d = new est(fcu.this.f.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.m(14737632);
               fcu.this.b(this);
            } else {
               this.d.m(16711680);
               fcu.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(erz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.f($$3 + $$4 - 45);
         this.d.g($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends esq.a<fcu.f> {
      @Nullable
      final List<arn> a;

      public f(@Nullable List<arn> $$0) {
         this.a = $$0;
      }
   }

   public class g extends esq<fcu.f> {
      public g(final cpx $$1) {
         super(fcu.this.f, fcu.this.g, fcu.this.h, 43, fcu.this.h - 32, 24);
         final Map<cpx.b, Map<cpx.e<?>, fcu.f>> $$2 = Maps.newHashMap();
         cpx.a(new cpx.c() {
            @Override
            public void b(cpx.e<cpx.a> $$0, cpx.f<cpx.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fcu.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(cpx.e<cpx.d> $$0, cpx.f<cpx.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fcu.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends cpx.g<T>> void a(cpx.e<T> $$0, fcu.c<T> $$1x) {
               tl $$2 = tl.c($$0.b());
               tl $$3 = tl.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               tl $$6 = tl.a("editGamerule.default", tl.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<arn> $$10;
               String $$11;
               if (gag.a($$7)) {
                  Builder<arn> $$8 = ImmutableList.builder().add($$3.g());
                  tl $$9 = tl.c($$7);
                  fcu.this.i.c($$9, 150).forEach($$8::add);
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
                  this.b(fcu.this.new b(tl.c(((cpx.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(cpx.e::a)))
                     .forEach($$0xx -> this.b((fcu.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void a(erz $$0, int $$1, int $$2, float $$3) {
         super.a($$0, $$1, $$2, $$3);
         fcu.f $$4 = this.r();
         if ($$4 != null && $$4.a != null) {
            fcu.this.b($$4.a);
         }
      }
   }
}
