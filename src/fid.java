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

public class fid extends fdm {
   private final Consumer<Optional<ctt>> a;
   private fid.g b;
   private final Set<fid.f> c = Sets.newHashSet();
   private exr k;
   @Nullable
   private List<aub> l;
   private final ctt m;

   public fid(ctt $$0, Consumer<Optional<ctt>> $$1) {
      super(vg.c("editGamerule.title"));
      this.m = $$0;
      this.a = $$1;
   }

   @Override
   protected void aP_() {
      this.b = this.d(new fid.g(this.m));
      fba.b $$0 = new fba().a(10).d(2);
      this.k = $$0.a(exr.a(vf.d, $$0x -> this.a.accept(Optional.of(this.m))).a());
      $$0.a(exr.a(vf.e, $$0x -> this.a.accept(Optional.empty())).a());
      $$0.a().a($$1 -> {
         exp var10000 = this.d($$1);
      });
      $$0.a().c(this.g / 2 - 155, this.h - 28);
      $$0.a().a();
   }

   @Override
   public void d() {
      this.a.accept(Optional.empty());
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.l = null;
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   private void o() {
      this.k.j = this.c.isEmpty();
   }

   void a(fid.f $$0) {
      this.c.add($$0);
      this.o();
   }

   void b(fid.f $$0) {
      this.c.remove($$0);
      this.o();
   }

   public class a extends fid.d {
      private final exy<Boolean> d;

      public a(vg $$1, List<aub> $$2, String $$3, ctt.a $$4) {
         super($$2, $$1);
         this.d = exy.b($$4.a()).a().a($$1x -> $$1x.d().f("\n").f($$3)).a(10, 5, 44, 20, $$1, ($$1x, $$2x) -> $$4.a($$2x, null));
         this.b.add(this.d);
      }

      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.n($$3 + $$4 - 45);
         this.d.o($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public class b extends fid.f {
      final vg b;

      public b(vg $$1) {
         super(null);
         this.b = $$1;
      }

      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         $$0.a(fid.this.f.h, this.b, $$3 + $$4 / 2, $$2 + 5, 16777215);
      }

      @Override
      public List<? extends ezm> l() {
         return ImmutableList.of();
      }

      @Override
      public List<? extends fbi> a() {
         return ImmutableList.of(new fbi() {
            @Override
            public fbi.a s() {
               return fbi.a.b;
            }

            @Override
            public void b(fbk $$0) {
               $$0.a(fbj.a, b.this.b);
            }
         });
      }
   }

   @FunctionalInterface
   interface c<T extends ctt.g<T>> {
      fid.f create(vg var1, List<aub> var2, String var3, T var4);
   }

   public abstract class d extends fid.f {
      private final List<aub> a;
      protected final List<exp> b = Lists.newArrayList();

      public d(@Nullable List<aub> $$1, vg $$2) {
         super($$1);
         this.a = fid.this.f.h.c($$2, 175);
      }

      @Override
      public List<? extends ezm> l() {
         return this.b;
      }

      @Override
      public List<? extends fbi> a() {
         return this.b;
      }

      protected void a(exe $$0, int $$1, int $$2) {
         if (this.a.size() == 1) {
            $$0.a(fid.this.f.h, this.a.get(0), $$2, $$1 + 5, 16777215, false);
         } else if (this.a.size() >= 2) {
            $$0.a(fid.this.f.h, this.a.get(0), $$2, $$1, 16777215, false);
            $$0.a(fid.this.f.h, this.a.get(1), $$2, $$1 + 10, 16777215, false);
         }
      }
   }

   public class e extends fid.d {
      private final eya d;

      public e(vg $$1, List<aub> $$2, String $$3, ctt.d $$4) {
         super($$2, $$1);
         this.d = new eya(fid.this.f.h, 10, 5, 44, 20, $$1.f().f("\n").f($$3).f("\n"));
         this.d.a(Integer.toString($$4.a()));
         this.d.b($$1x -> {
            if ($$4.b($$1x)) {
               this.d.g(14737632);
               fid.this.b(this);
            } else {
               this.d.g(16711680);
               fid.this.a(this);
            }
         });
         this.b.add(this.d);
      }

      @Override
      public void a(exe $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         this.a($$0, $$2, $$3);
         this.d.n($$3 + $$4 - 45);
         this.d.o($$2);
         this.d.a($$0, $$6, $$7, $$9);
      }
   }

   public abstract static class f extends exx.a<fid.f> {
      @Nullable
      final List<aub> a;

      public f(@Nullable List<aub> $$0) {
         this.a = $$0;
      }
   }

   public class g extends exx<fid.f> {
      public g(final ctt $$1) {
         super(fid.this.f, fid.this.g, fid.this.h - 75, 43, 24);
         final Map<ctt.b, Map<ctt.e<?>, fid.f>> $$2 = Maps.newHashMap();
         ctt.a(new ctt.c() {
            @Override
            public void b(ctt.e<ctt.a> $$0, ctt.f<ctt.a> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fid.this.new a($$0x, $$1xxx, $$2xx, $$3));
            }

            @Override
            public void c(ctt.e<ctt.d> $$0, ctt.f<ctt.d> $$1x) {
               this.a($$0, ($$0x, $$1xxx, $$2xx, $$3) -> fid.this.new e($$0x, $$1xxx, $$2xx, $$3));
            }

            private <T extends ctt.g<T>> void a(ctt.e<T> $$0, fid.c<T> $$1x) {
               vg $$2 = vg.c($$0.b());
               vg $$3 = vg.b($$0.a()).a(n.o);
               T $$4 = $$1.a($$0);
               String $$5 = $$4.b();
               vg $$6 = vg.a("editGamerule.default", vg.b($$5)).a(n.h);
               String $$7 = $$0.b() + ".description";
               List<aub> $$10;
               String $$11;
               if (ggg.a($$7)) {
                  Builder<aub> $$8 = ImmutableList.builder().add($$3.g());
                  vg $$9 = vg.c($$7);
                  fid.this.i.c($$9, 150).forEach($$8::add);
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
                  this.b(fid.this.new b(vg.c(((ctt.b)$$0x.getKey()).a()).a(n.r, n.o)));
                  ((Map)$$0x.getValue())
                     .entrySet()
                     .stream()
                     .sorted(Entry.comparingByKey(Comparator.comparing(ctt.e::a)))
                     .forEach($$0xx -> this.b((fid.f)$$0xx.getValue()));
               }
            );
      }

      @Override
      public void b(exe $$0, int $$1, int $$2, float $$3) {
         super.b($$0, $$1, $$2, $$3);
         fid.f $$4 = this.t();
         if ($$4 != null && $$4.a != null) {
            fid.this.b($$4.a);
         }
      }
   }
}
