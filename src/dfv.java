import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dfv(jr<cxd> d, int e, kt f, cxh g) {
   public static final Codec<dfv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxd.e.fieldOf("id").forGetter(dfv::a),
               ayi.m.fieldOf("count").orElse(1).forGetter(dfv::b),
               kt.a.optionalFieldOf("components", kt.c).forGetter(dfv::c)
            )
            .apply($$0, dfv::new)
   );
   public static final yn<wa, dfv> b = yn.a(cxd.f, dfv::a, yl.h, dfv::b, kt.b, dfv::c, dfv::new);
   public static final yn<wa, Optional<dfv>> c = b.a(yl::a);

   public dfv(dgy $$0) {
      this($$0, 1);
   }

   public dfv(dgy $$0, int $$1) {
      this($$0.i().f(), $$1, kt.c);
   }

   public dfv(jr<cxd> $$0, int $$1, kt $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dfv a(UnaryOperator<kt.a> $$0) {
      return new dfv(this.d, this.e, $$0.apply(kt.a()).a());
   }

   private static cxh a(jr<cxd> $$0, int $$1, kt $$2) {
      return new cxh($$0, $$1, $$2.c());
   }

   public boolean a(cxh $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public jr<cxd> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kt c() {
      return this.f;
   }

   public cxh d() {
      return this.g;
   }
}
