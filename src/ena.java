import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public class ena extends enq {
   public static final Codec<ena> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyu.a.g.fieldOf("heightmap").orElse(dyu.a.a).forGetter($$0x -> $$0x.b), Codec.INT.fieldOf("offset").orElse(0).forGetter($$0x -> $$0x.c))
            .apply($$0, ena::new)
   );
   private final dyu.a b;
   private final int c;

   public ena(dyu.a $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Nullable
   @Override
   public ent.c a(dcd $$0, ir $$1, ir $$2, ent.c $$3, ent.c $$4, enp $$5) {
      dyu.a $$6;
      if ($$0 instanceof aqt) {
         if (this.b == dyu.a.a) {
            $$6 = dyu.a.b;
         } else if (this.b == dyu.a.c) {
            $$6 = dyu.a.d;
         } else {
            $$6 = this.b;
         }
      } else {
         $$6 = this.b;
      }

      ir $$10 = $$4.a();
      int $$11 = $$0.a($$6, $$10.u(), $$10.w()) + this.c;
      int $$12 = $$3.a().v();
      return new ent.c(new ir($$10.u(), $$11 + $$12, $$10.w()), $$4.b(), $$4.c());
   }

   @Override
   protected ens<?> a() {
      return ens.g;
   }
}
