import java.util.List;

public interface cvu extends btz, cxe {
   int av_();

   int g();

   List<czk> h();

   default ddp ay_() {
      return this.az_().a();
   }

   default ddp.a az_() {
      return ddp.b(this.av_(), this.g(), this.h());
   }
}
