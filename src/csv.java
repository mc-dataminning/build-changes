import java.util.List;

public interface csv extends bse, cuf {
   int ay_();

   int g();

   List<cwq> h();

   default dat aB_() {
      return this.aC_().a();
   }

   default dat.a aC_() {
      return dat.b(this.ay_(), this.g(), this.h());
   }
}
