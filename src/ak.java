import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSyntaxException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.annotation.Nullable;

public class ak {
   private static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.ROOT);
   @Nullable
   private Date b;

   public boolean a() {
      return this.b != null;
   }

   public void b() {
      this.b = new Date();
   }

   public void c() {
      this.b = null;
   }

   @Nullable
   public Date d() {
      return this.b;
   }

   @Override
   public String toString() {
      return "CriterionProgress{obtained=" + (this.b == null ? "false" : this.b) + "}";
   }

   public void a(sf $$0) {
      $$0.a(this.b, sf::a);
   }

   public JsonElement e() {
      return (JsonElement)(this.b != null ? new JsonPrimitive(a.format(this.b)) : JsonNull.INSTANCE);
   }

   public static ak b(sf $$0) {
      ak $$1 = new ak();
      $$1.b = $$0.c(sf::u);
      return $$1;
   }

   public static ak a(String $$0) {
      ak $$1 = new ak();

      try {
         $$1.b = a.parse($$0);
         return $$1;
      } catch (ParseException var3) {
         throw new JsonSyntaxException("Invalid datetime: " + $$0, var3);
      }
   }
}
