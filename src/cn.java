import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cn extends dh<cn.a> {
   @Override
   public Codec<cn.a> a() {
      return cn.a.a;
   }

   public void a(aqu $$0, brv $$1, bqt $$2) {
      erp $$3 = bs.b($$0, $$1);
      this.a($$0, $$3x -> $$3x.a($$0, $$3, $$2));
   }

   public static record a(Optional<bd> b, Optional<bd> c, Optional<bh> d) implements dh.a {
      public static final Codec<cn.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(cn.a::a), axu.a(bs.b, "entity").forGetter(cn.a::e), axu.a(bh.a, "killing_blow").forGetter(cn.a::f))
               .apply($$0, cn.a::new)
      );

      public static ao<cn.a> a(Optional<bs> $$0) {
         return an.c.a(new cn.a(Optional.empty(), bs.a($$0), Optional.empty()));
      }

      public static ao<cn.a> a(bs.a $$0) {
         return an.c.a(new cn.a(Optional.empty(), Optional.of(bs.a($$0)), Optional.empty()));
      }

      public static ao<cn.a> b() {
         return an.c.a(new cn.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<cn.a> a(Optional<bs> $$0, Optional<bh> $$1) {
         return an.c.a(new cn.a(Optional.empty(), bs.a($$0), $$1));
      }

      public static ao<cn.a> a(bs.a $$0, Optional<bh> $$1) {
         return an.c.a(new cn.a(Optional.empty(), Optional.of(bs.a($$0)), $$1));
      }

      public static ao<cn.a> a(Optional<bs> $$0, bh.a $$1) {
         return an.c.a(new cn.a(Optional.empty(), bs.a($$0), Optional.of($$1.b())));
      }

      public static ao<cn.a> a(bs.a $$0, bh.a $$1) {
         return an.c.a(new cn.a(Optional.empty(), Optional.of(bs.a($$0)), Optional.of($$1.b())));
      }

      public static ao<cn.a> c() {
         return an.Z.a(new cn.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<cn.a> b(Optional<bs> $$0) {
         return an.d.a(new cn.a(Optional.empty(), bs.a($$0), Optional.empty()));
      }

      public static ao<cn.a> b(bs.a $$0) {
         return an.d.a(new cn.a(Optional.empty(), Optional.of(bs.a($$0)), Optional.empty()));
      }

      public static ao<cn.a> d() {
         return an.d.a(new cn.a(Optional.empty(), Optional.empty(), Optional.empty()));
      }

      public static ao<cn.a> b(Optional<bs> $$0, Optional<bh> $$1) {
         return an.d.a(new cn.a(Optional.empty(), bs.a($$0), $$1));
      }

      public static ao<cn.a> b(bs.a $$0, Optional<bh> $$1) {
         return an.d.a(new cn.a(Optional.empty(), Optional.of(bs.a($$0)), $$1));
      }

      public static ao<cn.a> b(Optional<bs> $$0, bh.a $$1) {
         return an.d.a(new cn.a(Optional.empty(), bs.a($$0), Optional.of($$1.b())));
      }

      public static ao<cn.a> b(bs.a $$0, bh.a $$1) {
         return an.d.a(new cn.a(Optional.empty(), Optional.of(bs.a($$0)), Optional.of($$1.b())));
      }

      public boolean a(aqu $$0, erp $$1, bqt $$2) {
         return this.d.isPresent() && !this.d.get().a($$0, $$2) ? false : this.c.isEmpty() || this.c.get().a($$1);
      }

      @Override
      public void a(be $$0) {
         dh.a.super.a($$0);
         $$0.a(this.c, ".entity");
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public Optional<bd> e() {
         return this.c;
      }

      public Optional<bh> f() {
         return this.d;
      }
   }
}
