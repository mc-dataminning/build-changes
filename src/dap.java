import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record dap(ji<cuf> d, int e, kk f, cuk g) {
   public static final Codec<dap> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               cuk.a.fieldOf("id").forGetter(dap::a),
               ayc.l.fieldOf("count").orElse(1).forGetter(dap::b),
               kk.a.optionalFieldOf("components", kk.c).forGetter(dap::c)
            )
            .apply($$0, dap::new)
   );
   public static final zj<ww, dap> b = zj.a(zh.b(lq.G), dap::a, zh.g, dap::b, kk.b, dap::c, dap::new);
   public static final zj<ww, Optional<dap>> c = b.a(zh::a);

   public dap(dbs $$0) {
      this($$0, 1);
   }

   public dap(dbs $$0, int $$1) {
      this($$0.r().o(), $$1, kk.c);
   }

   public dap(ji<cuf> $$0, int $$1, kk $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public dap a(UnaryOperator<kk.a> $$0) {
      return new dap(this.d, this.e, $$0.apply(kk.a()).a());
   }

   private static cuk a(ji<cuf> $$0, int $$1, kk $$2) {
      return new cuk($$0, $$1, $$2.c());
   }

   public boolean a(cuk $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public ji<cuf> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public kk c() {
      return this.f;
   }

   public cuk d() {
      return this.g;
   }
}
