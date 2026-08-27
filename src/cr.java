import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cr extends cv<cr.a> {
   @Override
   public Codec<cr.a> a() {
      return cr.a.a;
   }

   public void a(ane $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bb> b) implements cv.a {
      public static final Codec<cr.a> a = RecordCodecBuilder.create($$0 -> $$0.group(atw.a(bp.b, "player").forGetter(cr.a::a)).apply($$0, cr.a::new));

      public static an<cr.a> a(ci.a $$0) {
         return am.q.a(new cr.a(Optional.of(bp.a(bp.a.a().a($$0)))));
      }

      public static an<cr.a> a(bp.a $$0) {
         return am.q.a(new cr.a(Optional.of(bp.a($$0.b()))));
      }

      public static an<cr.a> a(Optional<bp> $$0) {
         return am.q.a(new cr.a(bp.a($$0)));
      }

      public static an<cr.a> b() {
         return am.r.a(new cr.a(Optional.empty()));
      }

      public static an<cr.a> c() {
         return am.I.a(new cr.a(Optional.empty()));
      }

      public static an<cr.a> d() {
         return am.Z.a(new cr.a(Optional.empty()));
      }

      public static an<cr.a> e() {
         return am.x.a(new cr.a(Optional.empty()));
      }

      public static an<cr.a> a(cwq $$0, cmt $$1) {
         return a(bp.a.a().a(bm.a.a().d(ca.a.a().a($$1))).b(ci.a.a().a(au.a.a().a($$0))));
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }
   }
}
