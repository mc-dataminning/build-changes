import java.util.List;

public interface cst extends bsc, cud {
   int ay_();

   int g();

   List<cwo> h();

   default dar aB_() {
      return this.aC_().a();
   }

   default dar.a aC_() {
      return dar.b(this.ay_(), this.g(), this.h());
   }
}
