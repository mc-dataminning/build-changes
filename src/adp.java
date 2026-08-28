import java.util.List;
import javax.annotation.Nullable;

public record adp(int b, List<cue.a> c) implements zf<abu> {
   public static final yw<vu, adp> a = yw.a(yu.h, adp::b, cue.a.a.a(yu.a()), adp::e, adp::new);

   @Override
   public zh<adp> a() {
      return agn.T;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   @Nullable
   public bwf a(dja $$0) {
      return $$0.a(this.b);
   }

   public List<cue.a> e() {
      return this.c;
   }
}
