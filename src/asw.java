import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.annotation.Nullable;

public abstract class asw<T> extends atf<T> {
   public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.ROOT);
   public static final String b = "forever";
   protected final Date c;
   protected final String d;
   @Nullable
   protected final Date e;
   protected final String f;

   public asw(@Nullable T $$0, @Nullable Date $$1, @Nullable String $$2, @Nullable Date $$3, @Nullable String $$4) {
      super($$0);
      this.c = $$1 == null ? new Date() : $$1;
      this.d = $$2 == null ? "(Unknown)" : $$2;
      this.e = $$3;
      this.f = $$4 == null ? "Banned by an operator." : $$4;
   }

   protected asw(@Nullable T $$0, JsonObject $$1) {
      super($$0);

      Date $$2;
      try {
         $$2 = $$1.has("created") ? a.parse($$1.get("created").getAsString()) : new Date();
      } catch (ParseException var7) {
         $$2 = new Date();
      }

      this.c = $$2;
      this.d = $$1.has("source") ? $$1.get("source").getAsString() : "(Unknown)";

      Date $$5;
      try {
         $$5 = $$1.has("expires") ? a.parse($$1.get("expires").getAsString()) : null;
      } catch (ParseException var6) {
         $$5 = null;
      }

      this.e = $$5;
      this.f = $$1.has("reason") ? $$1.get("reason").getAsString() : "Banned by an operator.";
   }

   public Date a() {
      return this.c;
   }

   public String b() {
      return this.d;
   }

   @Nullable
   public Date c() {
      return this.e;
   }

   public String d() {
      return this.f;
   }

   public abstract vu e();

   @Override
   boolean f() {
      return this.e == null ? false : this.e.before(new Date());
   }

   @Override
   protected void a(JsonObject $$0) {
      $$0.addProperty("created", a.format(this.c));
      $$0.addProperty("source", this.d);
      $$0.addProperty("expires", this.e == null ? "forever" : a.format(this.e));
      $$0.addProperty("reason", this.f);
   }
}
