import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public record ca(Optional<asx<cnb>> b, Optional<il<cnb>> c, ck.d d, ck.d e, List<bk> f, List<bk> g, Optional<ih<cpe>> h, Optional<cm> i) {
   private static final Codec<il<cnb>> j = kd.h.r().listOf().xmap(il::a, $$0 -> $$0.a().toList());
   public static final Codec<ca> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               atx.a(asx.a(ke.F), "tag").forGetter(ca::a),
               atx.a(j, "items").forGetter(ca::b),
               atx.a(ck.d.d, "count", ck.d.c).forGetter(ca::c),
               atx.a(ck.d.d, "durability", ck.d.c).forGetter(ca::d),
               atx.a(bk.a.listOf(), "enchantments", List.of()).forGetter(ca::e),
               atx.a(bk.a.listOf(), "stored_enchantments", List.of()).forGetter(ca::f),
               atx.a(kd.i.r(), "potion").forGetter(ca::g),
               atx.a(cm.a, "nbt").forGetter(ca::h)
            )
            .apply($$0, ca::new)
   );

   public boolean a(cng $$0) {
      if (this.b.isPresent() && !$$0.a(this.b.get())) {
         return false;
      } else if (this.c.isPresent() && !$$0.a(this.c.get())) {
         return false;
      } else if (!this.d.d($$0.L())) {
         return false;
      } else if (!this.e.c() && !$$0.i()) {
         return false;
      } else if (!this.e.d($$0.l() - $$0.k())) {
         return false;
      } else if (this.i.isPresent() && !this.i.get().a($$0)) {
         return false;
      } else {
         if (!this.f.isEmpty()) {
            Map<crr, Integer> $$1 = crt.a($$0.x());

            for (bk $$2 : this.f) {
               if (!$$2.a($$1)) {
                  return false;
               }
            }
         }

         if (!this.g.isEmpty()) {
            Map<crr, Integer> $$3 = crt.a(cmd.d($$0));

            for (bk $$4 : this.g) {
               if (!$$4.a($$3)) {
                  return false;
               }
            }
         }

         return !this.h.isPresent() || this.h.get().equals(cpg.d($$0));
      }
   }

   public Optional<asx<cnb>> a() {
      return this.b;
   }

   public Optional<il<cnb>> b() {
      return this.c;
   }

   public ck.d c() {
      return this.d;
   }

   public ck.d d() {
      return this.e;
   }

   public List<bk> e() {
      return this.f;
   }

   public List<bk> f() {
      return this.g;
   }

   public Optional<ih<cpe>> g() {
      return this.h;
   }

   public Optional<cm> h() {
      return this.i;
   }

   public static class a {
      private final Builder<bk> a = ImmutableList.builder();
      private final Builder<bk> b = ImmutableList.builder();
      private Optional<il<cnb>> c = Optional.empty();
      private Optional<asx<cnb>> d = Optional.empty();
      private ck.d e = ck.d.c;
      private ck.d f = ck.d.c;
      private Optional<ih<cpe>> g = Optional.empty();
      private Optional<cm> h = Optional.empty();

      private a() {
      }

      public static ca.a a() {
         return new ca.a();
      }

      public ca.a a(ctw... $$0) {
         this.c = Optional.of(il.a($$0x -> $$0x.j().i(), $$0));
         return this;
      }

      public ca.a a(asx<cnb> $$0) {
         this.d = Optional.of($$0);
         return this;
      }

      public ca.a a(ck.d $$0) {
         this.e = $$0;
         return this;
      }

      public ca.a b(ck.d $$0) {
         this.f = $$0;
         return this;
      }

      public ca.a a(ih<cpe> $$0) {
         this.g = Optional.of($$0);
         return this;
      }

      public ca.a a(so $$0) {
         this.h = Optional.of(new cm($$0));
         return this;
      }

      public ca.a a(bk $$0) {
         this.a.add($$0);
         return this;
      }

      public ca.a b(bk $$0) {
         this.b.add($$0);
         return this;
      }

      public ca b() {
         List<bk> $$0 = this.a.build();
         List<bk> $$1 = this.b.build();
         return new ca(this.d, this.c, this.e, this.f, $$0, $$1, this.g, this.h);
      }
   }
}
