import org.apache.commons.lang3.StringEscapeUtils;

public class ab extends RuntimeException {
   public ab(String $$0) {
      super(StringEscapeUtils.escapeJava($$0));
   }

   public ab(String $$0, Throwable $$1) {
      super(StringEscapeUtils.escapeJava($$0), $$1);
   }
}
