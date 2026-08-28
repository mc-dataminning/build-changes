import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dgl(js<cxu> d, int e, kv f, cxy g) {
   public static final Codec<dgl> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cxu.e.fieldOf("id").forGetter(dgl::a),
               ays.m.fieldOf("count").orElse(1).forGetter(dgl::b),
               kv.a.optionalFieldOf("components", kv.c).forGetter(dgl::c)
            )
            .apply($$0, dgl::new)
   );
   public static final yt<wg, dgl> b = yt.a(cxu.f, dgl::a, yr.h, dgl::b, kv.b, dgl::c, dgl::new);
   public static final yt<wg, Optional<dgl>> c = b.a(yr::a);

   public dgl(dho $$0) {
      this($$0, 1);
   }

   public dgl(dho $$0, int $$1) {
      this($$0.i().f(), $$1, kv.c);
   }

   public dgl(js<cxu> $$0, int $$1, kv $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dgl a(UnaryOperator<kv.a> $$0) {
      return new dgl(this.d, this.e, $$0.apply(kv.a()).a());
   }

   private static cxy a(js<cxu> $$0, int $$1, kv $$2) {
      return new cxy($$0, $$1, $$2.c());
   }

   public boolean a(cxy $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public js<cxu> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kv c() {
      return this.f;
   }

   public cxy d() {
      return this.g;
   }
}
