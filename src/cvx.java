import java.util.List;

public interface cvx extends btz, cxh {
   int av_();

   int g();

   List<czn> h();

   default dds ay_() {
      return this.az_().a();
   }

   default dds.a az_() {
      return dds.b(this.av_(), this.g(), this.h());
   }
}
