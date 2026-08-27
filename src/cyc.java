import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record cyc(in<crn> d, int e, jp f, crs g) {
   public static final Codec<cyc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               kt.h.r().fieldOf("id").forGetter(cyc::a), awu.j.fieldOf("count").orElse(1).forGetter(cyc::b), awu.a(jp.a, "components", jp.c).forGetter(cyc::c)
            )
            .apply($$0, cyc::new)
   );
   public static final yg<vt, cyc> b = yg.a(ye.b(ku.G), cyc::a, ye.f, cyc::b, jp.b, cyc::c, cyc::new);
   public static final yg<vt, Optional<cyc>> c = b.a(ye::a);

   public cyc(czf $$0) {
      this($$0, 1);
   }

   public cyc(czf $$0, int $$1) {
      this($$0.p().n(), $$1, jp.c);
   }

   public cyc(in<crn> $$0, int $$1, jp $$2) {
      this($$0, $$1, $$2, a($$0, $$1, $$2));
   }

   public cyc a(UnaryOperator<jp.a> $$0) {
      return new cyc(this.d, this.e, $$0.apply(jp.a()).a());
   }

   private static crs a(in<crn> $$0, int $$1, jp $$2) {
      return new crs($$0, $$1, $$2.c());
   }

   public boolean a(crs $$0) {
      return $$0.a(this.d) && this.f.a($$0);
   }

   public in<crn> a() {
      return this.d;
   }

   public int b() {
      return this.e;
   }

   public jp c() {
      return this.f;
   }

   public crs d() {
      return this.g;
   }
}
