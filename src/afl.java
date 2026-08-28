import java.util.Optional;

public record afl(String b, String c, int d, Optional<wv> e, Optional<yl> f) implements zc<abr> {
   public static final yt<wg, afl> a = yt.a(yr.o, afl::b, yr.o, afl::e, yr.h, afl::f, wx.e, afl::g, yn.d, afl::h, afl::new);

   @Override
   public ze<afl> a() {
      return agk.aP;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public String e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<wv> g() {
      return this.e;
   }

   public Optional<yl> h() {
      return this.f;
   }
}
