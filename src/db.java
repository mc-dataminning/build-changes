import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class db extends dh<db.a> {
   @Override
   public Codec<db.a> a() {
      return db.a.a;
   }

   public void a(aqu $$0) {
      this.a($$0, $$0x -> true);
   }

   public static record a(Optional<bd> b) implements dh.a {
      public static final Codec<db.a> a = RecordCodecBuilder.create($$0 -> $$0.group(axu.a(bs.b, "player").forGetter(db.a::a)).apply($$0, db.a::new));

      public static ao<db.a> a(cs.a $$0) {
         return an.q.a(new db.a(Optional.of(bs.a(bs.a.a().a($$0)))));
      }

      public static ao<db.a> a(bs.a $$0) {
         return an.q.a(new db.a(Optional.of(bs.a($$0.b()))));
      }

      public static ao<db.a> a(Optional<bs> $$0) {
         return an.q.a(new db.a(bs.a($$0)));
      }

      public static ao<db.a> b() {
         return an.r.a(new db.a(Optional.empty()));
      }

      public static ao<db.a> c() {
         return an.af.a(new db.a(Optional.empty()));
      }

      public static ao<db.a> d() {
         return an.ag.a(new db.a(Optional.empty()));
      }

      public static ao<db.a> e() {
         return an.I.a(new db.a(Optional.empty()));
      }

      public static ao<db.a> f() {
         return an.ab.a(new db.a(Optional.empty()));
      }

      public static ao<db.a> g() {
         return an.x.a(new db.a(Optional.empty()));
      }

      public static ao<db.a> h() {
         return an.ah.a(new db.a(Optional.empty()));
      }

      public static ao<db.a> i() {
         return an.ai.a(new db.a(Optional.empty()));
      }

      public static ao<db.a> a(int $$0) {
         da.d $$1 = new da.d().a(avz.i, lh.m.c(avz.aH).orElseThrow(), cu.d.b(99));
         bd $$2 = bs.a(bs.a.a().a($$1.b()));
         return an.al.a(new db.a(Optional.of($$2)));
      }

      public static ao<db.a> j() {
         return an.am.a(new db.a(Optional.empty()));
      }

      public static ao<db.a> a(dfc $$0, cuc $$1) {
         return a(bs.a.a().a(bp.a.a().d(ci.a.a().a($$1))).b(cs.a.a().a(aw.a.a().a($$0))));
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }
   }
}
