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

public class fhq extends fcz {
   private final Consumer<Optional<ctk>> a;
   private fhq.g b;
   private final Set<fhq.f> c = Sets.newHashSet();
   private exe k;
   @Nullable
   private List<atz> l;
   private final ctk m;

   public fhq(ctk $$0, Consumer<Optional<ctk>> $$1) {
      super(vf.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aN_() {
      this.b = this.d(new fhq.g(this.m));
      fan.b $$0 = new fan().a(10).d(2);
      this.k = $$0.a(exe.a(ve.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(exe.a(ve.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         exc var10000 = this.d($$1);
      });
      $$0.a().c(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void aE_() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void n() {
      this.k.j = this.c.isEmpty();
   }

   void a(fhq.f $$0) {
      this.c.add($$0);
      this.n();
   }

   void b(fhq.f $$0) {
      this.c.remove($$0);
      this.n();
   }

   public class a extends fhq.d {
      private final exl<Boolean> d;

      public a(vf $$1, List<atz> $$2, String $$3, ctk.a $$4) {
         super($$2, $$1);
         this.d = exl.b($$4.a()).a().a($$1x -> $$1x.d().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.n($$3 + $$4 - 45);
         this.d.o($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fhq.f {
      final vf b;

      public b(vf $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fhq.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends eyz> l() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fav> a() {
         return ImmutableList.of(new fav() {
            @Override
            public fav.a s() {
               return fav.a.b;
            }

            @Override
            public void b(fax $$0) {
               $$0.a(faw.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends ctk.g<T>> {
      fhq.f create(vf var1, List<atz> var2, String var3, T var4);
   }

   public abstract class d extends fhq.f {
      private final List<atz> a;
      protected final List<exc> b = Lists.newArrayList();

      public d(@Nullable List<atz> $$1, vf $$2) {
         super($$1);
         this.a = fhq.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends eyz> l() {
         return this.b;
      }

      @Override
      public List<? extends fav> a() {
         return this.b;
      }

      protected void a(ews $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fhq.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fhq.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fhq.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fhq.d {
      private final exn d;

      public e(vf $$1, List<atz> $$2, String $$3, ctk.d $$4) {
         super($$2, $$1);
         this.d = new exn(fhq.this.f.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fhq.this.b(this);
            } else {
               this.d.g(16711680);
               fhq.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(ews $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.n($$3 + $$4 - 45);
         this.d.o($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends exk.a<fhq.f> {
      @Nullable
      final List<atz> a;

      public f(@Nullable List<atz> $$0) {
         this.a = $$0;
      }
   }

   public class g extends exk<fhq.f> {
      public g(final ctk $$1) {
         super(fhq.this.f, fhq.this.g, fhq.this.h - 75, 43, 24);
         final Map<ctk.b, Map<ctk.e<?>, fhq.f>> $$2 = Maps.newHashMap();
         ctk.a(new ctk.c() {
            @Override
            public void b(ctk.e<ctk.a> $$0, ctk.f<ctk.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fhq.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(ctk.e<ctk.d> $$0, ctk.f<ctk.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fhq.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends ctk.g<T>> void a(ctk.e<T> $$0, fhq.c<T> $$1x) {
               vf $$2 = vf.c($$0.b());
               vf $$3 = vf.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               vf $$6 = vf.a("editGamerule.default", vf.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<atz> $$10;
               String $$11;
               if (gfq.a($$7)) {
                  Builder<atz> $$8 = ImmutableList.builder().add($$3.g());
                  vf $$9 = vf.c($$7);
                  fhq.this.i.c($$9, 150).forEach($$8::add);
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
                  this.b(fhq.this.new b(vf.c(((ctk.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(ctk.e::a)))
                     .forEach($$0xx -> this.b((fhq.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(ews $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fhq.f $$4 = this.t();
         if ($$4 != null && $$4.a != null) {
            fhq.this.b($$4.a);
         }
      }
   }
}
