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

public class fhs extends fdb {
   private final Consumer<Optional<ctl>> a;
   private fhs.g b;
   private final Set<fhs.f> c = Sets.newHashSet();
   private exg k;
   @Nullable
   private List<aua> l;
   private final ctl m;

   public fhs(ctl $$0, Consumer<Optional<ctl>> $$1) {
      super(vf.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aN_() {
      this.b = this.d(new fhs.g(this.m));
      fap.b $$0 = new fap().a(10).d(2);
      this.k = $$0.a(exg.a(ve.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(exg.a(ve.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         exe var10000 = this.d($$1);
      });
      $$0.a().c(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void aE_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void n() {
      this.k.j = this.c.isEmpty();
   }

   void a(fhs.f $$0) {
      this.c.add($$0);
      this.n();
   }

   void b(fhs.f $$0) {
      this.c.remove($$0);
      this.n();
   }

   public class a extends fhs.d {
      private final exn<Boolean> d;

      public a(vf $$1, List<aua> $$2, String $$3, ctl.a $$4) {
         super($$2, $$1);
         this.d = exn.b($$4.a()).a().a($$1x -> $$1x.d().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.n($$3 + $$4 - 45);
         this.d.o($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fhs.f {
      final vf b;

      public b(vf $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fhs.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends ezb> l() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fax> a() {
         return ImmutableList.of(new fax() {
            @Override
            public fax.a s() {
               return fax.a.b;
            }

            @Override
            public void b(faz $$0) {
               $$0.a(fay.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends ctl.g<T>> {
      fhs.f create(vf var1, List<aua> var2, String var3, T var4);
   }

   public abstract class d extends fhs.f {
      private final List<aua> a;
      protected final List<exe> b = Lists.newArrayList();

      public d(@Nullable List<aua> $$1, vf $$2) {
         super($$1);
         this.a = fhs.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends ezb> l() {
         return this.b;
      }

      @Override
      public List<? extends fax> a() {
         return this.b;
      }

      protected void a(ewu $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fhs.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fhs.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fhs.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fhs.d {
      private final exp d;

      public e(vf $$1, List<aua> $$2, String $$3, ctl.d $$4) {
         super($$2, $$1);
         this.d = new exp(fhs.this.f.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fhs.this.b(this);
            } else {
               this.d.g(16711680);
               fhs.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(ewu $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.n($$3 + $$4 - 45);
         this.d.o($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends exm.a<fhs.f> {
      @Nullable
      final List<aua> a;

      public f(@Nullable List<aua> $$0) {
         this.a = $$0;
      }
   }

   public class g extends exm<fhs.f> {
      public g(final ctl $$1) {
         super(fhs.this.f, fhs.this.g, fhs.this.h - 75, 43, 24);
         final Map<ctl.b, Map<ctl.e<?>, fhs.f>> $$2 = Maps.newHashMap();
         ctl.a(new ctl.c() {
            @Override
            public void b(ctl.e<ctl.a> $$0, ctl.f<ctl.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fhs.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(ctl.e<ctl.d> $$0, ctl.f<ctl.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fhs.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends ctl.g<T>> void a(ctl.e<T> $$0, fhs.c<T> $$1x) {
               vf $$2 = vf.c($$0.b());
               vf $$3 = vf.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               vf $$6 = vf.a("editGamerule.default", vf.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<aua> $$10;
               String $$11;
               if (gfs.a($$7)) {
                  Builder<aua> $$8 = ImmutableList.builder().add($$3.g());
                  vf $$9 = vf.c($$7);
                  fhs.this.i.c($$9, 150).forEach($$8::add);
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
                  this.b(fhs.this.new b(vf.c(((ctl.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(ctl.e::a)))
                     .forEach($$0xx -> this.b((fhs.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(ewu $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fhs.f $$4 = this.t();
         if ($$4 != null && $$4.a != null) {
            fhs.this.b($$4.a);
         }
      }
   }
}
