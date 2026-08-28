import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dr extends dx<dr.a> {
   @Override
   public Codec<dr.a> a() {
      return dr.a.a;
   }

   public void a(arn $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bg> b) implements dx.a {
      public static final Codec<dr.a> a = RecordCodecBuilder.create($$0 -> $$0.group(bv.b.optionalFieldOf("player").forGetter(dr.a::a)).apply($$0, dr.a::new));

      public static ao<dr.a> a(dg.a $$0) {
         return an.q.a(new dr.a(Optional.of(bv.a(bv.a.a().a($$0)))));
      }

      public static ao<dr.a> a(bv.a $$0) {
         return an.q.a(new dr.a(Optional.of(bv.a($$0.b()))));
      }

      public static ao<dr.a> a(Optional<bv> $$0) {
         return an.q.a(new dr.a(bv.a($$0)));
      }

      public static ao<dr.a> b() {
         return an.r.a(new dr.a(Optional.empty()));
      }

      public static ao<dr.a> c() {
         return an.I.a(new dr.a(Optional.empty()));
      }

      public static ao<dr.a> d() {
         return an.ab.a(new dr.a(Optional.empty()));
      }

      public static ao<dr.a> e() {
         return an.x.a(new dr.a(Optional.empty()));
      }

      public static ao<dr.a> a(jq<dhy> $$0, jq<cvt> $$1, dhy $$2, cvt $$3) {
         return a(bv.a.a().a(bs.a.a().d(ct.a.a().a($$1, $$3))).b(dg.a.a().a(aw.a.a().a($$0, $$2))));
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }
   }
}
